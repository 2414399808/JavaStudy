package d2_stream;

import java.util.*;
import java.util.function.IntFunction;
import java.util.stream.Collectors;

/**
 * 目标Stream流 的数据到集合或者数组中去
 */
public class StreamDemo5 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("张无忌");
        list.add("周芷若");
        list.add("赵敏");
        list.add("张强");
        list.add("张三丰");
        list.add("张三丰");
        Set<String> sets = new HashSet<>();
        sets.add("张无忌");
        sets.add("周芷若");
        sets.add("赵敏");
        sets.add("张强");
        sets.add("张三丰");
        sets.add("张三丰");
        Set<String> set1 = list.stream().filter(s -> s.startsWith("张")).collect(Collectors.toSet());
        List<String> list2 = list.stream().filter(s -> s.startsWith("张")).collect(Collectors.toList());
        List<String> list3 = list.stream().filter(s -> s.startsWith("张")).toList();//生成一个不可变List
        System.out.println(set1);
        System.out.println(list2);
        Set<String> set = sets.stream().filter(s -> s.startsWith("张")).collect(Collectors.toSet());
        System.out.println(set);
        //注意注意注意 流只能使用一次 收集起来的流就不能在使用了。
        Object[] array = list.stream().filter(s -> s.startsWith("张")).toArray();
        System.out.println(Arrays.toString(array));

        //拓展
        String[] strings = list.stream().toArray(new IntFunction<String[]>() {
            @Override
            public String[] apply(int value) {
                return new String[value];
            }
        });


    }
}
