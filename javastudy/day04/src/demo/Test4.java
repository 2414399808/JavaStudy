package demo;

import java.util.Random;
import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) {
        //目标 键盘录入一组工号 最终要随机输入一组出来作为排名
        //1 动态初始化一个数组 存储5个工号
        int[] codes=new int[5];
        //2 定义一个循环 循环5次 一次录入一个工号存入对应的位置
        Scanner sc=new Scanner(System.in);
        for (int i = 0; i < codes.length; i++) {
            System.out.println("请您输入第"+(i+1)+"个员工的工号");
            int code =sc.nextInt();
            codes[i]=code;
            
        }
        //3 遍历数组钟断每个元素 然后随机一个索引出来 让该元素与随即索引位置处的元素进行交换
        Random random=new Random();
        int res=0;
        for (int i = 0; i < codes.length; i++) {
            int index=random.nextInt(codes.length);
            res=codes[i];
            codes[i]=codes[index];
            codes[index]=res;
        }
        for (int i = 0; i < codes.length; i++) {
            System.out.println(codes[i]);

        }
    }
}
