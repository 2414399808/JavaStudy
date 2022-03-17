package jdbc;

import com.mysql.jdbc.Driver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 * JDBC快速入门
 */
public class JDBCDemo {
    public static void main(String[] args) throws Exception {
        //1 注册驱动
        Class.forName("com.mysql.jdbc.Driver");
//        Class c = Driver.class;

        //2 获取链接
        String url="jdbc:mysql://127.0.0.1:3306/db2";
        String username="root";
        String password="1234";
        Connection conn = DriverManager.getConnection(url, username, password);

        //3 定义sql
        String sql="update account set money = 2000 where id = 1";

        //4 获取执行sql的对象statement
        Statement stmt = conn.createStatement();

        //5执行sql
        int i = stmt.executeUpdate(sql);//返回值是受影响的行数

        //6 处理结果
        System.out.println(i);

        //7释放资源
        stmt.close();
        conn.close();


    }
}
