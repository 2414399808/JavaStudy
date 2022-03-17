package d1_set;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

/*
目标 观察TreeSet对于有值特性的数据如何排序
学会对自定义类型的对象指定排序规则
 */
public class SetDemo5 {
    public static void main(String[] args) {
        Set<Integer> sets1=new TreeSet<>();//不重复 无索引 可排序
        sets1.add(1);
        sets1.add(5);
        sets1.add(6);
        sets1.add(3);
        System.out.println(sets1);

        Set<String> sets2=new TreeSet<>();//不重复 无索引 可排序
        sets2.add("abc");
        sets2.add("123");
        sets2.add("李文龙");
        sets2.add("周思航");
        System.out.println(sets2);

        System.out.println("---------------不可以直接比较的数据类型----------------");
        //方法二 集合自带比较器对象进行定制 遵从就近原则 先看集合自带比较器规则 没有再看 类自带Comparable规则
        Set<Apple> sets3=new TreeSet<>(new Comparator<Apple>() {
            @Override
            public int compare(Apple o1, Apple o2) {
                return o1.getWeight()-o2.getWeight();
            }
        });
//        Set<Apple> sets3=new TreeSet<>(( o1, o2)-> {return o1.getWeight()-o2.getWeight();});
        sets3.add(new Apple("红富士","红色",9.9,500));
        sets3.add(new Apple("青苹果","绿色",15.9,300));
        sets3.add(new Apple("绿苹果","青色",29.9,400));
        sets3.add(new Apple("黄苹果","黄色",9.9,500));
        System.out.println(sets3);
    }
}
