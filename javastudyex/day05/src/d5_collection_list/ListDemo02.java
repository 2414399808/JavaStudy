package d5_collection_list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

/**
    拓展：List系列集合的遍历方式有：4种。

    List系列集合多了索引，所以多了一种按照索引遍历集合的for循环。

    List遍历方式：
        （1）for循环。(独有的，因为List有索引)。
        （2）迭代器。
        （3）foreach。
        （4）JDK 1.8新技术。
 */
public class ListDemo02 {
    public static void main(String[] args) {
        List<String> lists = new ArrayList<>();
        lists.add("java1");
        lists.add("java2");
        lists.add("java3");

        /** （1）for循环。 */
        System.out.println("-----------------------");
        for (int i = 0; i < lists.size(); i++) {
            System.out.println(lists.get(i));

        }



        /** （2）迭代器。 */
        System.out.println("-----------------------");
      Iterator<String> it=lists.iterator();
      while(it.hasNext()){
          System.out.println(it.next());
      }

        /** （3）foreach */
        System.out.println("-----------------------");
        for (String list : lists) {
            System.out.println(list);

        }

        /** （4）JDK 1.8开始之后的Lambda表达式  */
        System.out.println("-----------------------");
       lists.forEach(s -> System.out.println(s));

    }
}
