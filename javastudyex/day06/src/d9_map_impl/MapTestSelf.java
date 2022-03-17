package d9_map_impl;

import java.util.*;
import java.util.function.BiConsumer;

public class MapTestSelf {
    public static void main(String[] args) {
        Map<String, Set<String>> maps=new HashMap<>();
        Set<String> set1=new HashSet<>();
        Set<String> set2=new HashSet<>();
        Set<String> set3=new HashSet<>();
        Collections.addAll(set1,"A","B");
        Collections.addAll(set2,"C","B");
        Collections.addAll(set3,"D","C");
        maps.put("zsh",set1);
        maps.put("lwl",set2);
        maps.put("pwx",set3);
        Collection<Set<String>> values = maps.values();
        Map<String,Integer> map=new HashMap<>();
//        for (Set<String> value : values) {
//            for (String s : value) {
//                map.put(s,map.getOrDefault(s,0)+1);
//
//            }
//        }
//        System.out.println(map);
        maps.forEach(( s,  strings)-> {
                for (String string : strings) {
                    map.put(string,map.getOrDefault(string,0)+1);

                }
        });
        System.out.println(map);
    }
}
