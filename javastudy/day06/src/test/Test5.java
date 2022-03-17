package test;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Test5 {
    public static void main(String[] args) {
        int[] scores=new int[6];
        Scanner sc=new Scanner(System.in);
        for (int i = 0; i < scores.length; i++) {
            System.out.println("请你输入第"+(i+1)+"个评委的分数");
            int score=sc.nextInt();
            scores[i]=score;
        }
        int max=scores[0],min=scores[0],sum=0;
        for (int i = 0; i < scores.length; i++) {
            if(max>scores[i])
                max=scores[i];
            if(min>scores[i])
                min=scores[i];
            sum+=scores[i];

        }
        System.out.println((sum-min-max)*1.0/(scores.length-2));
    }
}
