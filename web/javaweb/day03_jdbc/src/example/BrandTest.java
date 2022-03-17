package example;

import com.alibaba.druid.pool.DruidDataSourceFactory;
import org.junit.Test;
import pojo.Brand;

import javax.sql.DataSource;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

/**
 * 品牌数据的测试对象
 */
public class BrandTest {
    @Test
    public void testSelectALL() throws Exception {
        List<Brand> list=new ArrayList<>();
        Properties prop = new Properties();
        prop.load(BrandTest.class.getResourceAsStream("/druid.properties"));
        DataSource dataSource = DruidDataSourceFactory.createDataSource(prop);
        Connection conn = dataSource.getConnection();
        String sql= "select * from tb_brand";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        ResultSet rs = pstmt.executeQuery();
        while (rs.next()){
            Brand b=new Brand(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getInt(4),rs.getString(5),rs.getInt(6));
            list.add(b);
        }
        System.out.println(list);
        rs.close();
        pstmt.close();
        conn.close();
    }
    @Test
    public void testAdd() throws Exception {
        Properties prop = new Properties();
        prop.load(BrandTest.class.getResourceAsStream("/druid.properties"));
        DataSource dataSource = DruidDataSourceFactory.createDataSource(prop);
        Connection conn = dataSource.getConnection();
        String sql= "insert into tb_brand(brand_name,company_name,ordered,description,status) values(?,?,?,?,?)";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setString(1,"香飘飘");
        pstmt.setString(2,"香飘飘");
        pstmt.setInt(3,1);
        pstmt.setString(4,"绕地球一圈");
        pstmt.setInt(5,1);
        int i = pstmt.executeUpdate();


        if(i>0){
            System.out.println("修改成功");
        }else{
            System.out.println("修改失败");
        }
        pstmt.close();
        conn.close();
    }
    @Test
    public void testUpdate() throws Exception {
        Properties prop = new Properties();
        prop.load(BrandTest.class.getResourceAsStream("/druid.properties"));
        DataSource dataSource = DruidDataSourceFactory.createDataSource(prop);
        Connection conn = dataSource.getConnection();
        String sql= "update tb_brand set status = ? where id = ?";
        PreparedStatement pstmt = conn.prepareStatement(sql);

        pstmt.setInt(1,1);

        pstmt.setInt(2,1);
        int i = pstmt.executeUpdate();


        if(i>0){
            System.out.println("修改成功");
        }else{
            System.out.println("修改失败");
        }
        pstmt.close();
        conn.close();
    }
    @Test
    public void testDelete() throws Exception {
        Properties prop = new Properties();
        prop.load(BrandTest.class.getResourceAsStream("/druid.properties"));
        DataSource dataSource = DruidDataSourceFactory.createDataSource(prop);
        Connection conn = dataSource.getConnection();
        String sql= "delete from tb_brand  where id = ? ";
        PreparedStatement pstmt = conn.prepareStatement(sql);



        pstmt.setInt(1,4);
        int i = pstmt.executeUpdate();


        if(i>0){
            System.out.println("修改成功");
        }else{
            System.out.println("修改失败");
        }
        pstmt.close();
        conn.close();
    }
}
