package d2_stream;

import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 目标：Stream流的获取

 Stream流式思想的核心：
 是先得到集合或者数组的Stream流（就是一根传送带）
 然后就用这个Stream流操作集合或者数组的元素。
 然后用Stream流简化替代集合操作的API.

 集合获取流的API:
 (1) default Stream<E> stream();

 小结：
 集合获取Stream流用: stream();
 数组：Arrays.stream(数组)   /  Stream.of(数组);
 */
public class StreamDemo2 {
    public static void main(String[] args) {
        /** --------------------Collection集合获取流-------------------------------   */
        Collection<String> list=new ArrayList<>();
        Stream<String> stream = list.stream();


        /** --------------------Map集合获取流-------------------------------   */
        Map<String,Integer> maps=new HashMap<>();

        //键流
        Set<String> strings = maps.keySet();
        Stream<String> Keystream = strings.stream();

        //值流
        Collection<Integer> values = maps.values();
        Stream<Integer> valuesStream = values.stream();

        //键值对流
        Set<Map.Entry<String, Integer>> entries = maps.entrySet();
        Stream<Map.Entry<String, Integer>> entryStream = entries.stream();

        /** ---------------------数组获取流------------------------------   */
        int[] arr={1,2,3,4};
        IntStream arrStream = Arrays.stream(arr);
        String[] strs={"1","2","3"};
        Stream<String> stringStream = Arrays.stream(strs);

        Stream<String> stringStream1 = Stream.of(strs);
    }
}
