package d9_map_impl;

import d1_set.Student;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapDemo2 {
    public static void main(String[] args) {
        //1 创建一个Map集合对象
        Map<String,Integer> maps=new LinkedHashMap<>();//一行经典代码
        maps.put("鸿星尔克",3);
        maps.put("枸杞",100);
        maps.put("java",1);
        maps.put("java",100);//会覆盖前面的数据
        maps.put(null,null);
        System.out.println(maps);
    }
}
