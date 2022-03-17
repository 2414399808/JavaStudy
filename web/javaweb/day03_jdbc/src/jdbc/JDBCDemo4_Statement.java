package jdbc;

import org.junit.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 * JDBC快速入门 Statement
 */
public class JDBCDemo4_Statement {
    /**
     * 执行对应的DML
     * @throws Exception
     */
    @Test
    public void testDML() throws Exception {
        //1 注册驱动
        Class.forName("com.mysql.jdbc.Driver");
//        Class c = Driver.class;

        //2 获取链接
        String url="jdbc:mysql://127.0.0.1:3306/db2?useSSL=false";
        String username="root";
        String password="1234";
        Connection conn = DriverManager.getConnection(url, username, password);

        //3 定义sql
        String sql="update account set money = 2000 where id = 9";

        //4 获取执行sql的对象statement
        Statement stmt = conn.createStatement();

        //5执行sql
        int i = stmt.executeUpdate(sql);//执行完DML语句 返回值是受影响的行数

        //6 处理结果
        if(i>0){
            System.out.println("修改成功");
        }else{
            System.out.println("修改失败");
        }

        //7释放资源
        stmt.close();
        conn.close();

    }
    @Test
    public void testDDL() throws Exception {
        //1 注册驱动
        Class.forName("com.mysql.jdbc.Driver");
//        Class c = Driver.class;

        //2 获取链接
        String url="jdbc:mysql://127.0.0.1:3306/db2?useSSL=false";
        String username="root";
        String password="1234";
        Connection conn = DriverManager.getConnection(url, username, password);

        //3 定义sql
        String sql="create database db3";

        //4 获取执行sql的对象statement
        Statement stmt = conn.createStatement();

        //5执行sql
        int i = stmt.executeUpdate(sql);//执行ddl语句 返回值可能是0

        //6 处理结果
//        if(i>0){
//            System.out.println("修改成功");
//        }else{
//            System.out.println("修改失败");
//        }

        //7释放资源
        stmt.close();
        conn.close();

    }
}
