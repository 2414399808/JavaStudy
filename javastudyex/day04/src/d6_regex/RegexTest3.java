package d6_regex;

import java.util.Scanner;

public class RegexTest3 {
    public static void main(String[] args) {
        //目标 校验手机号码 邮箱 电话号码
//        checkPhone();
//        checkEmail();
//        checkTel();


    }

    public static void checkPhone(){
        Scanner sc=new Scanner(System.in);
        while (true) {
            System.out.println("请输入手机号");
            String phoneNumber = sc.next();
            if(phoneNumber.matches("1[3-9]\\d{9}")){
                System.out.println("手机号码正确");
                break;
            }
            else{
                System.out.println("格式有误");
            }
        }
    }
    public static void checkEmail(){
        Scanner sc=new Scanner(System.in);
        while (true) {
            System.out.println("请输入邮箱");
            String email = sc.next();
            //邮箱正则表达式
            //xxxxxxxxxx@xxxx.xxxx.xxxx
            //xxxxxxxxxx@xxxx.xxxx
            if(email.matches("\\w{1,20}@[a-zA-Z0-9&&[^_]]{2,20}(\\.[a-zA-Z0-9&&[^_]]{2,20}){1,2}")){
                System.out.println("邮箱正确");
                break;
            }
            else{
                System.out.println("格式有误");
            }
        }
    }
    public static void checkTel(){
        Scanner sc=new Scanner(System.in);
        while (true) {
            System.out.println("请输入电话号码");
            String tel = sc.next();
            //027-3572457 027
            if(tel.matches("0\\d{2,6}-?\\d{5,20}")){
                System.out.println("电话号码正确");
                break;
            }
            else{
                System.out.println("格式有误");
            }
        }
    }

}
