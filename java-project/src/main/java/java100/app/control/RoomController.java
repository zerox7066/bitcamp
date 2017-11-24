package java100.app.control;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import java100.app.domain.Room;

// RoomController는 ArrayList를 상속 받은 서브 클래스이기도 하지만,
// Controller라는 규칙을 따르는 클래스이기도 하다!
public class RoomController extends ArrayList<Room> implements Controller {
    
    private static final long serialVersionUID = 1L;

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
    
    @Override
    public void execute(Request request, Response response) {
        switch (request.getMenuPath()) {
        case "/room/list": this.doList(request, response); break;
        case "/room/add": this.doAdd(request, response); break;
        case "/room/view": this.doView(request, response); break;
        case "/room/update": this.doUpdate(request, response); break;
        case "/room/delete": this.doDelete(request, response); break;
        default: 
            System.out.println("해당 명령이 없습니다.");
        } 
    }

    private void doUpdate(Request request, Response response) {
        
        PrintWriter out = response.getWriter();
        out.println("[강의실 변경]");

        try ( Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/studydb?useSSL=false&verifyServerCertificate=false", "study", "1111");
              
              PreparedStatement pstmt = con.prepareStatement(
                      "update ex_room set name=?, loc=?, capacity=? where no=?");
        ){
            pstmt.setString(1, request.getParameter("name"));
            pstmt.setString(2, request.getParameter("loc"));
            pstmt.setInt(3, Integer.parseInt(request.getParameter("capacity")));
            pstmt.setInt(4, Integer.parseInt(request.getParameter("no")));
            
            if (pstmt.executeUpdate() > 0) {
                out.println("변경하였습니다.");
            } else {
                out.printf("'%s'의 강의실 정보가 없습니다.\n", request.getParameter("no"));
            }
            
        } catch (Exception e) {
            e.printStackTrace();
            out.println(e.getMessage());
        }
        
    }
    
    private void doView(Request request, Response response) {
        
        PrintWriter out = response.getWriter();
        out.println("[강의실 상세 정보]");

        try ( Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/studydb?useSSL=false&verifyServerCertificate=false", "study", "1111");
              
              PreparedStatement pstmt = con.prepareStatement(
                      "select no, loc, name, capacity from ex_room where no=?");
              
        ){
            pstmt.setInt(1, Integer.parseInt(request.getParameter("no")));
            
            ResultSet rs = pstmt.executeQuery();
            
            if (rs.next()) {
                out.printf("번호 : %d\n", rs.getInt("no"));
                out.printf("위치: %s\n", rs.getString("loc"));
                out.printf("강의실명: %s\n", rs.getString("name"));
                out.printf("수용인원: %d\n", rs.getInt("capacity"));
                
            } else {
                out.printf("'%s'의 강의실 정보가 없습니다.\n", request.getParameter("no"));
            }
            
        } catch (Exception e) {
            e.printStackTrace();
            out.println(e.getMessage());
        }        
    } 
    
    private void doList(Request request, Response response) {
        
        PrintWriter out = response.getWriter();
        out.println("[강의실 목록]");
        
        try ( Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/studydb?useSSL=false&verifyServerCertificate=false", "study", "1111");
              
              PreparedStatement pstmt = con.prepareStatement(
                      "select no, name, loc, capacity from ex_room");
              
              ResultSet rs = pstmt.executeQuery();
        ){
            while (rs.next()) {
                out.printf("%4d, %s, %s, %d\n",
                        rs.getInt("no"),
                        rs.getString("name"),
                        rs.getString("loc"), 
                        rs.getInt("capacity")
                        );
            }
            
        } catch (Exception e) {
            e.printStackTrace();
            out.println(e.getMessage());
        }        
        
    }
    
    private void doAdd(Request request, Response response) {
        
        PrintWriter out = response.getWriter();
        out.println("[강의실 등록]");
        
        try ( Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/studydb?useSSL=false&verifyServerCertificate=false", "study", "1111");
              
              PreparedStatement pstmt = con.prepareStatement(
                      "insert into ex_room(name, loc, capacity) values(?,?,?)");
        ){
            pstmt.setString(1, request.getParameter("name"));
            pstmt.setString(2, request.getParameter("loc"));
            pstmt.setInt(3, Integer.parseInt(request.getParameter("capacity")));
            
            pstmt.executeUpdate();
            out.println("저장하였습니다.");
            
        } catch (Exception e) {
            e.printStackTrace();
            out.println(e.getMessage());
        }
    } 
    
    private void doDelete(Request request, Response response) {
        
        PrintWriter out = response.getWriter();
        out.println("[강의실 삭제]");

        try ( Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/studydb?useSSL=false&verifyServerCertificate=false", "study", "1111");
              
              PreparedStatement pstmt = con.prepareStatement(
                      "delete from ex_room where no=?");
              
        ){
            pstmt.setInt(1, Integer.parseInt(request.getParameter("no")));
            
            if (pstmt.executeUpdate() > 0) {
                out.println("삭제하였습니다.");
            } else {
                out.printf("%s의 강의실 정보가 없습니다.\n",
                        request.getParameter("no"));
            }
            
        } catch (Exception e) {
            e.printStackTrace();
            out.println(e.getMessage());
        }        
    }
}










