package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class JDBCDemo2_DriverManager {
    public static void main(String[] args) throws Exception {
//        Class.forName("com.mysql.jdbc.Driver");
        String url="jdbc:mysql://127.0.0.1:3306/db2?useSSL=false";
        String username="root";
        String password="1234";
        Connection conn = DriverManager.getConnection(url, username, password);
        String sql="update account set money=2000 where id=2";
        Statement stmt = conn.createStatement();
        int i = stmt.executeUpdate(sql);
        System.out.println(i);
    }
}
