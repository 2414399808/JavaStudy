package d7_properties;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Properties;

public class PropertiesDemo02 {
    public static void main(String[] args) throws Exception {
        Properties properties=new Properties();
        properties.load(new FileReader("day10/src/test.properties"));
        System.out.println(properties);
        System.out.println(properties.getProperty("zsh"));
    }
}
