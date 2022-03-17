package test;

import org.junit.Test;

import java.lang.reflect.Constructor;

public class test01 {
    @Test
    public void getConstructors() throws Exception {
        Class c= Student.class;
        Constructor[] declaredConstructors = c.getDeclaredConstructors();
        for (Constructor declaredConstructor : declaredConstructors) {
            System.out.println(declaredConstructor);
        }
        Constructor declaredConstructor = c.getDeclaredConstructor(String.class,int.class);
        System.out.println(declaredConstructor);
        declaredConstructor.setAccessible(true);
        Student zsh = (Student) declaredConstructor.newInstance("zsh", 20);
        System.out.println(zsh);


    }
}
