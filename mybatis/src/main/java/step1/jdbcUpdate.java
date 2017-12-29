// DBMS에 연결하기
package step1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class jdbcUpdate {
    
    public static void main(String[] args) throws Exception {
        
        // 클래스 로딩   Method Area
        Class.forName("com.mysql.jdbc.Driver");
        
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/studydb", "study", "1111");
        
        System.out.println("연결되었음!");
        
        Statement stmt = con.createStatement();
        
        stmt.executeUpdate(
                "update jdbc_test set title = 'xxx', conts = 'xxxx' where no = 32");
        
        System.out.println("변경완료");
        
        stmt.close();
        con.close();
    }

}
