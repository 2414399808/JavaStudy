package d6_reflect_fenericity;

import org.junit.Test;

import java.lang.reflect.Method;
import java.util.ArrayList;

public class test {
    @Test
    public void testarray() throws Exception {
        ArrayList<String> list1=new ArrayList<>();
        ArrayList<Integer> list2=new ArrayList<>();
        list2.add(22);
        list2.add(22);
        list2.add(22);
        Class c=ArrayList.class;
        Method add = c.getDeclaredMethod("add", Object.class);
        add.invoke(list2,"zyx");
        System.out.println(list2);


    }

}
