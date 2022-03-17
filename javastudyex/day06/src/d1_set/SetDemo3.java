package d1_set;

import java.util.HashSet;
import java.util.Set;

/**
 * 目标 让set集合把重复内容的对象去掉一个（去重复
 */
public class SetDemo3 {
    public static void main(String[] args) {
        //set集合去重复原因 先判断哈希值 在判断 equals
        Set<Student> sets=new HashSet<>();
        Student s1=new Student("zsh",20,'男');
        Student s2=new Student("lwl",21,'男');
        Student s3=new Student("zsh",20,'男');
        sets.add(s1);
        sets.add(s2);
        sets.add(s3);
        System.out.println(s1.hashCode()==s3.hashCode());
        System.out.println(sets);
        Set<String> setss=new HashSet<>();
        setss.add("lll");
        setss.add("lll");
        setss.add("lll");
        System.out.println(setss);

    }

}
