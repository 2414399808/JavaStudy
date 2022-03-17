package stringAndarraylist.String;

import java.util.Scanner;

public class StringExec8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入你的手机号码：");
        String number= sc.next();
        String substring = number.substring(4, 8);
        System.out.println(number.replace(substring,"****"));
    }
}
