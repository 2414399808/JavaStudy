package d9_map_impl;

import java.util.*;
import java.util.function.BiConsumer;

public class MapTest4 {
    public static void main(String[] args) {
        //1 要求程序记录每个学生选择的情况
        //使用Map集合存储
        Map<String, List<String>> maps = new HashMap<>();
        //2 把学生选择的数据存入进去
        List<String> selects = new ArrayList<>();
        Collections.addAll(selects, "A", "B");
        List<String> selects2 = new ArrayList<>();
        Collections.addAll(selects2, "A", "D");
        List<String> selects3 = new ArrayList<>();
        Collections.addAll(selects3, "A", "B", "C", "D");
        maps.put("罗勇", selects);
        maps.put("zsh", selects2);
        maps.put("lwl", selects3);
        System.out.println(maps);
        //3 统计每个景点选择的人数
        Map<String, Integer> map = new HashMap<>();
        maps.forEach(new BiConsumer<String, List<String>>() {
            @Override
            public void accept(String s, List<String> strings) {
                for (String string : strings) {
                    map.put(string, map.getOrDefault(string, 0) + 1);
                }
            }
        });
        System.out.println(map);
    }
}
