package stringAndarraylist.arraylist;

import java.util.ArrayList;

public class ArrayListTest5 {
    public static void main(String[] args) {
        //1 定义一个电影类
        ArrayList<Movie> list=new ArrayList<>();
        Movie m1=new Movie("肖申克的救赎",9.7,"罗宾斯");
        list.add(m1);
        list.add(new Movie("霸王别姬",9.6,"张国荣"));
        list.add(new Movie("阿甘正传",9.5,"汤姆，汉克斯"));
        System.out.println(list);
    }
}
