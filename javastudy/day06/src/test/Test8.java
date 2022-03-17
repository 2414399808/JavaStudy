package test;

import java.util.Random;
import java.util.Scanner;

public class Test8 {
    public static void main(String[] args) {
        int[] arr =createLuckNumber();
        for (int j : arr) {
            System.out.println(j);

        }
       judge(arr,chooseNumber());
    }
    public static void judge(int[] arr1,int[] arr2){
        boolean flag=true;
        for (int i = 0; i < arr2.length; i++) {

            if(arr1[i]!=arr2[i]){
                System.out.println("很可惜");
                flag=false;
                break;
            }

        }
        if(flag){
            System.out.println("恭喜");
        }
    }
    public static int[] createLuckNumber(){
        int[] numbers=new int[7];
        Random random=new Random();
        for (int i = 0; i < 6; i++) {
            while(true){
                boolean flag=true;
                int i1 = random.nextInt(33) + 1;
                for (int j=0;j<i;j++){
                    if(i1==numbers[j]){
                        flag=false;
                        break;
                    }
                }
                if(flag){
                    numbers[i]=i1;
                    break;
                }
            }
        }
        numbers[numbers.length-1]=random.nextInt(16)+1;
        return numbers;
    }
    public static int[] chooseNumber(){
        Scanner sc=new Scanner(System.in);
        int[] arr=new int[7];
        for (int i = 0; i < 7; i++) {
            arr[i]=sc.nextInt();
        }
        return arr;
    }
}
