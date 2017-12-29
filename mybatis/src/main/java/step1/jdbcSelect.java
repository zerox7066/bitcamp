// DBMS에 연결하기
package step1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class jdbcSelect {
    
    public static void main(String[] args) throws Exception {
        
        // 클래스 로딩   Method Area
        Class.forName("com.mysql.jdbc.Driver");
        
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/studydb?useSSL=false&verifyServerCertificate=false", "study", "1111");
        
        System.out.println("연결되었음!");
        System.out.println("");
        
        Statement stmt = con.createStatement();
        
        ResultSet rs = stmt.executeQuery(
                "select * from jdbc_test");
        
        while (rs.next()) {
            System.out.printf("%d, %s %s, %s, %d\n", 
                    rs.getInt("no"), 
                    rs.getString(2),
                    rs.getString("conts"),
                    rs.getDate("regdt"),    //rs.getDate("regdt").toString(),
                    rs.getInt("vwcnt")
                    );
        }
        
        rs.close();
        stmt.close();
        con.close();
    }

}
