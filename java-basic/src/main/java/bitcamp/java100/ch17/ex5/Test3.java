package bitcamp.java100.ch17.ex5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Test3 {
    
    public static void main(String[] args) throws Exception {
        
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/studydb?useSSL=false&verifyServerCertificate=false",
                "study", "1111");
        
        //Class.forName("oracle.jdbc.driver.OracleDriver");
        //Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "scott", "tiger");

        System.out.println("서버접속");
        
        PreparedStatement pstmt = con.prepareStatement(
                "select * from jdbc_test where title = ? and vwcnt = ?");
        
        pstmt.setString(1, "aaa");
        pstmt.setInt(2, 0);
        
        ResultSet rs = pstmt.executeQuery();
        
        while (rs.next()) {
            System.out.printf("%d, %s, %s, %s, %d\n",
                    rs.getInt("no"),
                    rs.getString("title"),
                    rs.getString("conts"),
                    rs.getString("regdt"),
                    rs.getInt("vwcnt")
                    );
        }
        
        pstmt.close();
        con.close();
        
    }

}
