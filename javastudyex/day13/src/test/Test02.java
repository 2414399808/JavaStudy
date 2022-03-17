package test;

import org.junit.Test;

import java.lang.reflect.Field;

public class Test02 {
    @Test
    public void getField() throws Exception {
        Class c= Student.class;
        Field[] declaredFields = c.getDeclaredFields();
        for (Field declaredField : declaredFields) {
            System.out.println(declaredField);

        }
        Field age = c.getDeclaredField("age");
        age.setAccessible(true);
        Student s=new Student();
        age.set(s,18);
        System.out.println(s);
        System.out.println(age.get(s));
    }
}
