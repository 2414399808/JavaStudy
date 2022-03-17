package d7_reflect_framework;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.lang.reflect.Field;

public class MybatisUtil {
    /*
    保存任意类型的对象
     */
    public static void save(Object obj)  {
        try (PrintStream ps=new PrintStream(new FileOutputStream("day13/src/data.txt",true));){
            Class c = obj.getClass();

            ps.println("=================="+c.getSimpleName()+"====================");
            Field[] declaredFields = c.getDeclaredFields();
            for (Field declaredField : declaredFields) {
                declaredField.setAccessible(true);
                String name = declaredField.getName();
                String value = declaredField.get(obj)+"";
                ps.println(name+"="+value);
            }
        } catch (FileNotFoundException | IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
