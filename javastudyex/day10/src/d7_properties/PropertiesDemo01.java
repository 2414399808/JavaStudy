package d7_properties;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class PropertiesDemo01 {
    public static void main(String[] args) throws Exception {
        //需求 使用Properties 把键值对信息存入到属性文件中去
        Properties properties=new Properties();
        properties.setProperty("zsh","123");
        properties.setProperty("lwl","124");
        properties.setProperty("pwx","125");
        /*
        参数一 保存管道 字符输出流管道
        参数二 保存心得
         */
        properties.store(new FileWriter("day10/src/test.properties"),"llll");

        }
}
