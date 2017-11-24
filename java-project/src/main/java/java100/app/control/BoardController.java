package java100.app.control;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Iterator;

import java100.app.domain.Board;

public class BoardController extends GenericController<Board> {
    
    @Override
    public void destroy() {}
    
    @Override
    public void init() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            throw new RuntimeException("JDBC 드라이버 클래스를 찾을 수 없습니다.");
        }
    }    
    
    // 실제 이 클래스가 오버라이딩 하는 메서드는 
    // GenericController가 따른다고 한 Controller 인터페이스의 
    // 추상 메서드이다.
    @Override
    public void execute(Request request, Response response) {
            
        // 명령어를 처리하는 각 코드를 별도의 메서드로 추출한다.
        switch (request.getMenuPath()) {
        case "/board/list": this.doList(request, response); break;
        case "/board/add": this.doAdd(request, response); break;
        case "/board/view": this.doView(request, response); break;
        case "/board/update": this.doUpdate(request, response); break;
        case "/board/delete": this.doDelete(request, response); break;
        default: 
            System.out.println("해당 명령이 없습니다.");
        }
    }
    
    private void doList(Request request, Response response) {
        
        PrintWriter out = response.getWriter();
        out.println("[게시물 목록]");
        
        try ( Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/studydb?useSSL=false&verifyServerCertificate=false", "study", "1111");
              
              PreparedStatement pstmt = con.prepareStatement(
                      "select no, title, conts, regdt, vwcnt from ex_board");
              
              ResultSet rs = pstmt.executeQuery();
        ){
            while (rs.next()) {
                out.printf("%d, %s, %s, %s, %d\n",
                        rs.getInt("no"),
                        rs.getString("title"), 
                        rs.getString("conts"),
                        rs.getDate("regdt"),
                        rs.getInt("vwcnt"));
            }
            
        } catch (Exception e) {
            e.printStackTrace();
            out.println(e.getMessage());
        }
    }

    private void doAdd(Request request, Response response) {
        
        PrintWriter out = response.getWriter();
        out.println("[게시물 등록]");
                
        try ( Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/studydb?useSSL=false&verifyServerCertificate=false", "study", "1111");
              
              PreparedStatement pstmt = con.prepareStatement(
                      "insert into ex_board(title, conts, regdt) values(?,?,now())");
        ){
            pstmt.setString(1, request.getParameter("title"));
            pstmt.setString(2, request.getParameter("content"));
            
            pstmt.executeUpdate();
            out.println("저장하였습니다.");
            
        } catch (Exception e) {
            e.printStackTrace();
            out.println(e.getMessage());
        }
        
    } 
    
    private void doView(Request request, Response response) {
        
        PrintWriter out = response.getWriter();
        out.println("[게시물 상세 정보]");     
        

        int boardno = 0;
        int vwcnt = 0;
        try ( Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/studydb?useSSL=false&verifyServerCertificate=false", "study", "1111");
              
              PreparedStatement pstmt = con.prepareStatement(
                      "select no, title, conts, regdt, vwcnt from ex_board where no=?");
              
        ){
            pstmt.setInt(1, Integer.parseInt(request.getParameter("no")));
            
            ResultSet rs = pstmt.executeQuery();
            
            if (rs.next()) {
                boardno = rs.getInt("no");
                vwcnt = rs.getInt("vwcnt");
                
                out.printf("번호 : %d\n", boardno);
                out.printf("제목 : %s\n", rs.getString("title"));
                out.printf("내용 : %s\n", rs.getString("conts"));
                out.printf("등록일 : %s\n", rs.getDate("regdt"));
                out.printf("조회수 : %d\n", vwcnt);
            } else {
                out.printf("'%s'의 게시판 정보가 없습니다.\n", request.getParameter("no"));
            }
                        
            //pstmt.close();
            //rs.close();
            
        } catch (Exception e) {
            e.printStackTrace();
            out.println(e.getMessage());
        }        
        
        try ( Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/studydb?useSSL=false&verifyServerCertificate=false", "study", "1111");
              
              PreparedStatement pstmt = con.prepareStatement(
                      "update ex_board set vwcnt=? where no=?");
        ){
            pstmt.setInt(1, vwcnt + 1);
            pstmt.setInt(2, boardno);
            pstmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
            out.println(e.getMessage());
        }
    }
    
    private void doUpdate(Request request, Response response) {
        
        PrintWriter out = response.getWriter();
        out.println("[게시물 변경]");
        
        try ( Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/studydb?useSSL=false&verifyServerCertificate=false", "study", "1111");
              
              PreparedStatement pstmt = con.prepareStatement(
                      "update ex_board set title=?, conts=? where no=?");
        ){
            pstmt.setString(1, request.getParameter("title"));
            pstmt.setString(2, request.getParameter("content"));
            pstmt.setInt(3, Integer.parseInt(request.getParameter("no")));
            
            if (pstmt.executeUpdate() > 0) {
                out.println("변경하였습니다.");
            } else {
                out.printf("'%s'의 게시판 정보가 없습니다.\n", request.getParameter("no"));
            }
            
        } catch (Exception e) {
            e.printStackTrace();
            out.println(e.getMessage());
        }
    }
    
    private void doDelete(Request request, Response response) {
        
        PrintWriter out = response.getWriter();
        out.println("[게시물 삭제]");
        
        try ( Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/studydb?useSSL=false&verifyServerCertificate=false", "study", "1111");
              
              PreparedStatement pstmt = con.prepareStatement(
                      "delete from ex_board where no=?");
              
        ){
            pstmt.setInt(1, Integer.parseInt(request.getParameter("no")));
            
            if (pstmt.executeUpdate() > 0) {
                out.println("삭제하였습니다.");
            } else {
                out.printf("%s의 게시판 정보가 없습니다.\n",
                        request.getParameter("no"));
            }
            
        } catch (Exception e) {
            e.printStackTrace();
            out.println(e.getMessage());
        }        
    }
}








