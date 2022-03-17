package random;

import java.util.Random;

public class RandomDemo1 {
    public static void main(String[] args) {
        Random random = new Random();

        for (int i = 0; i < 25; i++) {
            System.out.println(random.nextInt(25)+1);

        }
        System.out.println("------------------------------");
        //3-17
        for (int i = 0; i <10; i++) {
           int mm=random.nextInt(15);
            System.out.println(mm+3);
        }
    }
}
