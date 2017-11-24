// DBMS에 연결하기
package bitcamp.java100.ch17.ex4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class Test2 {
    
    public static void main(String[] args) throws Exception {
        
        // 클래스 로딩   Method Area
        Class.forName("com.mysql.jdbc.Driver");
        
        Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/studydb?useSSL=false&verifyServerCertificate=false", 
                "study", "1111");
        
        PreparedStatement pstmt = con.prepareStatement(
                "insert into jdbc_test(title,conts,regdt) values(?,?,now())",
                Statement.RETURN_GENERATED_KEYS);

        pstmt.setString(1, "제목이래요");
        pstmt.setString(2, "내용이래요...");
        
        pstmt.executeUpdate();
        System.out.println("입력완료");
        
        ResultSet autokeyRS = pstmt.getGeneratedKeys();
        
        autokeyRS.next();
        
        System.out.println(autokeyRS.getInt(1));
        autokeyRS.close();
        
        pstmt.close();
        con.close();
    }

}
