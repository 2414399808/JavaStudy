package stringAndarraylist.arraylist;

import java.util.ArrayList;

public class ArrayListDemo1 {
    public static void main(String[] args) {
        //1 创建ArrayList集合的对象
        ArrayList list=new ArrayList();

        //2 添加数据
        list.add("java");
        list.add("mysql");
        list.add("python");
        list.add(123);
        list.add(124);

        System.out.println(list);

        //3 给指定索引位置插入元素
        list.add(3,"查在这里");
        System.out.println(list);

    }
}
