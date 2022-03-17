package stringAndarraylist.String;

import java.util.Scanner;

public class StringExec7 {
    public static void main(String[] args) {
        //1 定义正确的登录名称
        String okLoginName="admin";
        String okPassword="123";

        //2 定义一个循环 循环3次 让用户登录
        Scanner sc=new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.println("请您输入登录名称：");
            String loginname=sc.next();
            System.out.println("请您输入密码：");
            String password=sc.next();
            if(loginname.equals(okLoginName)&&password.equals(okPassword)){
                System.out.println("登录成功");
                break;
            }
            else{
                System.out.println("账号或密码错误，你还有"+(3-1-i)+"次机会！");
            }
        }
    }
}
