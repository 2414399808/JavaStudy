package loop;

import java.util.Scanner;

public class DeadforDemo8 {
    //死循环
    public static void main(String[] args) {
//        for (;;) {
//            System.out.println("hhhhhhh");
//        }
//        while(true){
//            System.out.println("llllllll");
//        }
//        do{
//            System.out.println("ooooooo");
//        }while (true);
        System.out.println("--------------------------");
        int rightpassword=520;
        Scanner sc=new Scanner(System.in);
        while(true){
            if(sc.nextInt()!=520){
                System.out.println("密码输入错误！");
            }
            else{
                System.out.println("欢迎！");
                break;
            }
        }
    }
}
