package d2_stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

/*
目标 初步体验Stream流的方便和快捷
 */
public class StreamTest {
    public static void main(String[] args) {
        List<String> names=new ArrayList<>();
        Collections.addAll(names,"张三丰","张无忌","周芷若","赵敏","张强");
        System.out.println(names);

//        //1 从集合中找到姓张的放到新集合
//
//        List<String> zhangList=new ArrayList<>();
//        for (String name : names) {
//            if(name.startsWith("张")){
//                zhangList.add(name);
//            }
//        }
//        System.out.println(zhangList);
//
//        //2找名称长度是3的姓名
//        List<String> zhangThreeList =new ArrayList<>();
//        for (String s : zhangList) {
//            if(s.length()==3)
//                zhangThreeList.add(s);
//
//        }
//        System.out.println(zhangThreeList);

        //3使用Stream流方法
        names.stream().filter(s->s.startsWith("张")).filter(s->s.length()==3).forEach(System.out::println);
        names.stream().filter(s->s.startsWith("张")&&s.length()==3).forEach(System.out::println);


    }
}
