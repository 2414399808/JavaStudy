package d7_reflect_framework.test;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.lang.reflect.Field;

public class MybatisUtil {

    public static void save(Object obj) throws Exception {
        PrintStream ps=new PrintStream(new FileOutputStream("day13/src/data2.txt"));
        Class c = obj.getClass();
        Field[] fields = c.getDeclaredFields();
        ps.println("============"+c.getSimpleName()+"=============");
        for (Field field : fields) {
            field.setAccessible(true);
            ps.println(field.getName()+"="+field.get(obj));
            ps.flush();

        }
    }
}
