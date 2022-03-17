package druid;

import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.util.Properties;

/**
 * druid数据库连接池
 */
public class DruidDemo {
    public static void main(String[] args) throws Exception {
        //1 导入jar包

        //2 定义配置文件

        //3 加载配置文件
        Properties prop =new Properties();
       prop.load(DruidDemo.class.getResourceAsStream("/druid.properties"));
//        prop.load(new FileInputStream("src/druid.properties"));
        //4 获取连接池对象
        DataSource dataSource = DruidDataSourceFactory.createDataSource(prop);

        //5获取对应的数据库链接

        Connection conn = dataSource.getConnection();
        System.out.println(conn);
    }
}
