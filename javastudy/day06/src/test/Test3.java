package test;

import java.util.Random;
import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入位数");
        int n=sc.nextInt();
        System.out.println(checkcode(n));
    }
    public static String checkcode(int n){

        Random random=new Random();
        String CheckCode="";
        for(int i=0;i<n;i++){
          int x=random.nextInt(3);
          switch(x){
              case(0):
                  char ch1= (char) (random.nextInt(26)+65);
                  CheckCode+=ch1;
                  break;
              case(1):
                  char ch2= (char) (random.nextInt(26)+97);
                  CheckCode+=ch2;
                  break;
              case(2):
                  CheckCode+=random.nextInt(10);
                  break;
          }
        }
        return CheckCode;
    }
}
