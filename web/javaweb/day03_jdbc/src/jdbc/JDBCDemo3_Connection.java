package jdbc;

import com.mysql.jdbc.Driver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCDemo3_Connection {
    public static void main(String[] args) throws Exception {
        String url="jdbc:mysql://127.0.0.1:3306/db2?useSSL=false";
        String username="root";
        String password="1234";
        Connection conn = DriverManager.getConnection(url, username, password);
        String sql1="update account set money=3000 where id=1";
        String sql2="update account set money=3000 where id=2";
        Statement stmt = conn.createStatement();
        try {
            //开启事务
            conn.setAutoCommit(false);
            int count1 = stmt.executeUpdate(sql1);
            System.out.println(count1);
            int i=10/0;
            int count2 = stmt.executeUpdate(sql2);
            System.out.println(count2);
        } catch (Exception e) {
            // 回滚事务
            conn.rollback();
            e.printStackTrace();
        }

        // 提交事务
        conn.commit();
        stmt.close();
        conn.close();
    }
}
