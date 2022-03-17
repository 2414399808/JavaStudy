package stringAndarraylist.arraylist;

import java.util.ArrayList;

public class ArrayListDemo3 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Java");
        list.add("MySQL");
        list.add("MyBatis");
        list.add("HTML");

        // 1、public E get(int index)：获取某个索引位置处的元素值
        System.out.println(list.get(4));

        // 2、public int size()：获取集合的大小（元素个数）

        System.out.println(list.size());
        // 3、完成集合的遍历
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));

        }

        // 4、public E remove(int index)：删除某个索引位置处的元素值,并返回被删除的元素值
        System.out.println(list.remove(2));
        System.out.println("-----------------");
        System.out.println(list);
        // 5、public boolean remove(Object o):直接删除元素值，删除成功返回true，删除失败返回false
        System.out.println("-----------------");
        System.out.println(list.remove("Java"));
        System.out.println("-----------------");
        // 只会删除第一次出现的这个元素值，后面的不删除
        System.out.println(list);
        // 6、public E set(int index,E element)：修改某个索引位置处的元素值。
        list.set(1,"狗都不学");
        System.out.println(list);
    }
}
