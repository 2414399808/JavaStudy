package d9_map_impl;

import d1_set.Student;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class HashMapDemo1 {
    public static void main(String[] args) {
        //map集合是根据键去重复元素的
        Map<Student,String> sets=new HashMap<>();
        Student s1=new Student("zsh",20,'男');
        Student s2=new Student("lwl",21,'男');
        Student s3=new Student("zsh",20,'男');
        sets.put(s1,"北京");
        sets.put(s2,"上海");
        sets.put(s3,"广州");
        System.out.println(sets);
    }
}
