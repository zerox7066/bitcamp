// DBMS에 연결하기
package bitcamp.java100.ch17.ex5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Test2 {
    
    public static void main(String[] args) throws Exception {
        
        Scanner keyboard = new Scanner(System.in);
        
        // 클래스 로딩   Method Area
        Class.forName("com.mysql.jdbc.Driver");
        
        Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/studydb?useSSL=false&verifyServerCertificate=false", 
                "study", "1111");
        
        PreparedStatement pstmt = con.prepareStatement(
                "insert into jdbc_test(title,conts,regdt) values(?,?,now())");

        con.setAutoCommit(false);
        
        while (true) {
            System.out.print("제목?");
            String title = keyboard.nextLine();
            
            System.out.print("내용?");
            String contents = keyboard.nextLine();
            
            pstmt.setString(1, title);
            pstmt.setString(2, contents);
            
            pstmt.executeUpdate();            
            System.out.println("입력완료");

            System.out.print("께속 입력하시겠습니까?(Y/n) ");
            String str = keyboard.nextLine().toLowerCase();
            
            if (!str.equals("y"))
                break;
        }
        
        con.commit();
        
        keyboard.close();
        pstmt.close();
        con.close();
    }

}
