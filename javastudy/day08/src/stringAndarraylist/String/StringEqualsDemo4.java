package stringAndarraylist.String;

import java.util.Scanner;

public class StringEqualsDemo4 {
    public static void main(String[] args) {
        String name="zsh";
        String password="1234";

        Scanner sc=new Scanner(System.in);
        System.out.println("登录名称：");
        String name1=sc.next();
        System.out.println("登录密码：");
        String password1=sc.next();

        if(name1.equals(name)&&password.equals(password1))
        {
            System.out.println("登录成功");
        }
        else
        {
            System.out.println("登陆失败");
        }
        String code="GHKdsf";
        String code1="ghkdsf";
        System.out.println(code.equalsIgnoreCase(code1));
    }
}
