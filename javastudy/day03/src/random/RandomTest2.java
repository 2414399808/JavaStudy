package random;

import java.util.Random;
import java.util.Scanner;

public class RandomTest2 {
    public static void main(String[] args) {
        Random random=new Random();
        int number=random.nextInt(100);
        Scanner sc=new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.println("请猜：");
            int cai=sc.nextInt();
            if(cai>number){
                System.out.println("猜大了！");

            }
            else if(cai<number){
                System.out.println("猜小了！");
            }
            else{
                System.out.println("猜对了");
            }
        }
    }
}
