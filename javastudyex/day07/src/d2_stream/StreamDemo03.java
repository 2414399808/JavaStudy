package d2_stream;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

/**
     目标：Stream流的常用API
         forEach : 逐一处理(遍历)
         count：统计个数
            -- long count();
         filter : 过滤元素
            -- Stream<T> filter(Predicate<? super T> predicate)
         limit : 取前几个元素
         skip : 跳过前几个
         map : 加工方法
         concat : 合并流。
 */
public class StreamDemo03 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("张无忌");
        list.add("周芷若");
        list.add("赵敏");
        list.add("张强");
        list.add("张三丰");
        list.add("张三丰");

        // Stream<T> filter(Predicate<? super T> predicate)
       list.stream().filter(s-> s.startsWith("张")).forEach(s-> System.out.println(s));
        long count = list.stream().filter(s -> s.length() == 3).count();
        System.out.println(count);
        // list.stream().filter(s -> s.startsWith("张")).limit(2).forEach(s -> System.out.println(s));
        //limit是限制输出几个数据 skip是跳过几个数据
        list.stream().filter(s->s.startsWith("张")).limit(2).forEach(System.out::println);
        list.stream().filter(s->s.startsWith("张")).skip(2).forEach(System.out::println);

        //Map加工方法
//        list.stream().map(new Function<String, String>() {
//            @Override
//            public String apply(String s) {
//                return "黑马"+s;
//            }
//        }).forEach(s-> System.out.println(s));



        // map加工方法: 第一个参数原材料  -> 第二个参数是加工后的结果。
        // 给集合元素的前面都加上一个：黑马的：
        list.stream().map(s-> "黑马"+s).forEach(s-> System.out.println(s));

        // 需求：把所有的名称 都加工成一个学生对象。
        list.stream().map(s-> new Student(s)).forEach(s-> System.out.println(s));
        list.stream().map(Student::new).forEach(System.out::println);

        // 合并流。
        Stream<String> stream = list.stream().filter(s -> s.startsWith("张"));
        Stream<String> stream2=Stream.of("Java1","Java2");
        Stream.concat(stream,stream2).forEach(s-> System.out.println(s));
        // public static <T> Stream<T> concat(Stream<? extends T> a, Stream<? extends T> b)
        //两种不同的流合并 一定要用 object接
        Stream<String> s1 = list.stream().filter(s -> s.startsWith("张"));
        Stream<Integer> s2=Stream.of(1,2);
        Stream<Object> concat = Stream.concat(s1, s2);

        //去重复distinct
        list.stream().distinct().forEach(System.out::println);

    }
}
