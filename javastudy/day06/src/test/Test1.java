package test;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入机票原价");
        int price = sc.nextInt();
        System.out.println("请输入月份");
        int mouth=sc.nextInt();
        if(mouth<1||mouth>12)
            System.out.println("输入月份错误，请输入正确的月份");
        System.out.println("请输入你选择的舱级");
        String choose = sc.next();
        if(choose.equals("经济舱")){
            if(mouth>=5&&mouth<=10){
                price*=0.9;
            }
            else{
                price*=0.85;
            }
        }
        else{
            if(mouth>=5&&mouth<=10){
                price*=0.7;
            }
            else{
                price*=0.65;
            }
        }
        System.out.println("请支付"+price);
    }
}
