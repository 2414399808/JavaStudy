package d6_reflect_fenericity;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;

public class ReflectDemo {
    public static void main(String[] args) throws Exception {
        //需求 反射实现泛型擦除后 加入其他类型元素
        ArrayList<String> list1=new ArrayList<>();
        ArrayList<Integer> list2=new ArrayList<>();
        System.out.println(list1.getClass());
        System.out.println(list2.getClass());
        Class c = list2.getClass();
        System.out.println("-----------------------------");
        list2.add(22);
        list2.add(23);
        //list2.add("黑马");
        //定位c类中的add方法
        Method add = c.getDeclaredMethod("add",Object.class);
        add.invoke(list2,"这是一个数字");
        System.out.println(list2);


        ArrayList list3=list2;
        list3.add("这也是一个数字");
        list3.add(false);
        System.out.println(list2);
    }
}
