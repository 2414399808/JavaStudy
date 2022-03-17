package d7_genericity;

import java.util.ArrayList;
import java.util.List;

/**
    目标：泛型的概述。

    什么是泛型？
        泛型就是一个标签：<数据类型>
        泛型可以在编译阶段约束只能操作某种数据类型。

    注意：
        JDK 1.7开始之后后面的泛型申明可以省略不写
    小结：
         泛型就是一个标签。
         泛型可以在编译阶段约束只能操作某种数据类型。
         泛型只能支持引用数据类型。
 */
public class GenericityDemo {
    public static void main(String[] args) {
    List<String> list=new ArrayList<>();
    list.add("Java");
    list.add("Java2");

    List list1=new ArrayList();
    list1.add("Java");
    list1.add(23.3);
    list1.add(false);

        for (Object o : list1) {
            String s = o+"";
            System.out.println(s);

        }
        for (String s : list) {
            System.out.println(s);

        }
        System.out.println("-----------------------");
        List<Object> list2=new ArrayList<>();
        list2.add("23");
        list2.add("23.2");
        list2.add("lllllll");

    }
}
