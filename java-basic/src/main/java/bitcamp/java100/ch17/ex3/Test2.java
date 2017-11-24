// DBMS에 연결하기
package bitcamp.java100.ch17.ex3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.Scanner;

public class Test2 {
    
    public static void main(String[] args) throws Exception {
        
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("변경할 게시물 번호?");
        String no = keyboard.nextLine();
        
        System.out.print("제목?");
        String title = keyboard.nextLine();
        
        System.out.print("내용?");
        String contents = keyboard.nextLine();
        keyboard.close();
        
        // 클래스 로딩   Method Area
        Class.forName("com.mysql.jdbc.Driver");
        
        Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/studydb?useSSL=false&verifyServerCertificate=false", 
                "study", "1111");
        
        System.out.println("연결되었음!");
        
        PreparedStatement pstmt = con.prepareStatement(
                "update jdbc_test set title = ?, conts = ? where no = ?");
        
        pstmt.setString(1, title);
        pstmt.setString(2, contents);
        pstmt.setString(3, no);
        
        pstmt.executeUpdate();
                        
        System.out.println("변경완료");
                
        pstmt.close();
        
        con.close();
    }

}



























