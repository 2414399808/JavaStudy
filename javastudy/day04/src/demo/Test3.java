package demo;

import java.util.Random;
import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        Random random=new Random();
        int[] arr=new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=random.nextInt(20)+1;
        }
        Scanner sc=new Scanner(System.in);
        OUT:
        while(true){
            System.out.println("请输入一个数字：");
            int i = sc.nextInt();
            for (int j = 0; j < arr.length; j++) {
                if(i==arr[j]) {
                    System.out.println("恭喜你猜对了");
                    break OUT;
                }
            }
            System.out.println("当前猜测的数据在数组中不存在");
        }
    }
}
