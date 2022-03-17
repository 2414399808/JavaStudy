package jdbc;

import org.junit.Test;
import pojo.Account;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 * JDBC快速入门 ResultSet
 */
public class JDBCDemo5_ResultSet {
    /**
     * 执行DQL查询语句
     * @throws Exception
     */
    @Test
    public void testResultSet() throws Exception {
        //1 注册驱动
        Class.forName("com.mysql.jdbc.Driver");
//        Class c = Driver.class;

        //2 获取链接
        String url="jdbc:mysql://127.0.0.1:3306/db2?useSSL=false";
        String username="root";
        String password="1234";
        Connection conn = DriverManager.getConnection(url, username, password);
        //3 定义查询语句
        String sql="select * from account";
        //4获取statement对象
        Statement stmt = conn.createStatement();
        //5执行sql
        ResultSet rs = stmt.executeQuery(sql);

        //6处理结果 遍历rs中的所有数据
        //6.1 光标向下移动一行 并且判断当前行是否有数据
        while(rs.next()){
            //6.2 获取数据 getxxx()
            int rsInt = rs.getInt(1);
//            int rsInt = rs.getInt("id");
            String name = rs.getString(2);
//            String name = rs.getString("name");
            String money = rs.getString(3);
//            String money = rs.getString("money");
            System.out.println(rsInt+" "+name+" "+money);
        }
        rs.close();
        stmt.close();
        conn.close();

    }
    @Test
    public void testResultSet2() throws Exception {
        List<Account> list=new ArrayList<>();


        //1 注册驱动
        Class.forName("com.mysql.jdbc.Driver");
//        Class c = Driver.class;

        //2 获取链接
        String url="jdbc:mysql://127.0.0.1:3306/db2?useSSL=false";
        String username="root";
        String password="1234";
        Connection conn = DriverManager.getConnection(url, username, password);
        //3 定义查询语句
        String sql="select * from account";
        //4获取statement对象
        Statement stmt = conn.createStatement();
        //5执行sql
        ResultSet rs = stmt.executeQuery(sql);

        //6处理结果 遍历rs中的所有数据
        //6.1 光标向下移动一行 并且判断当前行是否有数据
        while(rs.next()){

            //6.2 获取数据 getxxx()
            int rsInt = rs.getInt(1);
//            int rsInt = rs.getInt("id");
            String name = rs.getString(2);
//            String name = rs.getString("name");
            String money = rs.getString(3);
//            String money = rs.getString("money");
//            System.out.println(rsInt+" "+name+" "+money);
            Account account=new Account(rsInt,name,money);
            list.add(account);
        }
        System.out.println(list);
        rs.close();
        stmt.close();
        conn.close();

    }
}
