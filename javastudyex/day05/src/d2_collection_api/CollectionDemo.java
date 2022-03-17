package d2_collection_api;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

/**
 目标：Collection集合的常用API.
 Collection是集合的祖宗类，它的功能是全部集合都可以继承使用的，所以要学习它。
 Collection API如下:
 - public boolean add(E e)：  把给定的对象添加到当前集合中 。
 - public void clear() :清空集合中所有的元素。
 - public boolean remove(E e): 把给定的对象在当前集合中删除。
 - public boolean contains(Object obj): 判断当前集合中是否包含给定的对象。
 - public boolean isEmpty(): 判断当前集合是否为空。
 - public int size(): 返回集合中元素的个数。
 - public Object[] toArray(): 把集合中的元素，存储到数组中。
 小结：
 记住以上API。
 */
public class CollectionDemo {
    public static void main(String[] args) {
        // HashSet:添加的元素是无序，不重复，无索引。
        Collection<String> list=new ArrayList<>();
        // 1.添加元素, 添加成功返回true。
        //一般来说 Arraylist集合 add方法返回值不会为false 因为ArrayList可重复 而HashSet就可能会返回false了 因为HashSet不可重复
        list.add("Java");
        list.add("HTML");
        list.add("HTML");
        list.add("MySQL");
        list.add("Java");
        list.add("黑马");
        System.out.println(list.add("黑马"));
        System.out.println(list);
        // 2.清空集合的元素。
//        list.clear();
//        System.out.println(list);

        // 3.判断集合是否为空 是空返回true,反之。
        System.out.println(list.isEmpty());

        // 4.获取集合的大小。

        System.out.println(list.size());
        // 5.判断集合中是否包含某个元素。
        System.out.println(list.contains("Java"));
        System.out.println(list.contains("java"));

        // 6.删除某个元素:如果有多个重复元素默认删除前面的第一个！ 返回值是有没有删除成功
        list.remove("Java");
        System.out.println(list);
        // 7.把集合转换成数组  [HTML, HTML, MySQL, Java, 黑马]
        Object[] arrs = list.toArray();
        System.out.println(Arrays.toString(arrs));

        System.out.println("-------------拓展-------------------");
        Collection<String> c1=new ArrayList<>();
        c1.add("java1");
        c1.add("java2");
        Collection<String> c2=new ArrayList<>();
        c2.add("赵敏");
        c2.add("殷素素");
        //addAll把c2集合的元素全部倒入到c1中
        System.out.println(c1.addAll(c2));
        System.out.println(c1);
    }
}
