package Scanner;

import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {
        //目标 学会使用键盘录入技术
       Scanner sc=new Scanner(System.in);
        System.out.println("请输入数量");
        System.out.println(sc.nextInt());
        System.out.println("请输入名称");
        System.out.println(sc.next());
    }
}
