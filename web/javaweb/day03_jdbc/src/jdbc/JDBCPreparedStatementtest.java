package jdbc;

import java.sql.*;

public class JDBCPreparedStatementtest {
    public static void main(String[] args) throws Exception {
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/db1?useSSL=false","root","1234");
        PreparedStatement pstmt = conn.prepareStatement("select * from tb_user where username = ? and password = ?");
        pstmt.setString(1,"zhangsan");
        pstmt.setString(2,"123");
        ResultSet rs = pstmt.executeQuery();
        while(rs.next()){
            System.out.println(rs.getString(1));
            System.out.println(rs.getString(2));
        }
    }
}
