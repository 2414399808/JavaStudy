package d1_unchange_collection;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 *  目标 不可变集合
 */
public class CollectionDemo {
    public static void main(String[] args) {
        //不可变的list集合 有的地方称常量集合
        List<Double> lists= List.of(569.5,700.0,523.0,570.5);
        System.out.println(lists);
//        lists.add(689.0);
        System.out.println(lists);

        //不可变set集合
        Set<String> names = Set.of("zsh","lwl","pwx","zyq");
        System.out.println(names);

        //不可变Map集合
        Map<String,Integer> maps=Map.of("1",1,"2",2);
        System.out.println(maps);
    }
}
