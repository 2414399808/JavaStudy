package d9_map_impl;

import d1_set.Apple;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo3 {
    public static void main(String[] args) {
        Map<Integer,String> maps1=new TreeMap<>();
        maps1.put(13,"zsh");
        maps1.put(1,"lwl");
        maps1.put(12,"pwx");
        System.out.println(maps1);

        Map<Apple,String> maps=new TreeMap<>(new Comparator<Apple>() {
            @Override
            public int compare(Apple o1, Apple o2) {
                return o1.getPrice()==o2.getPrice()?1:Double.compare(o1.getPrice(),o2.getPrice());
            }
        });
        maps.put(new Apple("红富士","红色",9.9,500),"1");
        maps.put(new Apple("青苹果","绿色",15.9,300),"2");
        maps.put(new Apple("绿苹果","青色",29.9,400),"3");
        maps.put(new Apple("黄苹果","黄色",9.9,500),"4");
        System.out.println(maps);
    }
}
