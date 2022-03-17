package test;

import java.util.Scanner;

public class Test6 {
    public static void main(String[] args) {
        //需求 数字加密
        Scanner sc=new Scanner(System.in);
        int[] arr=new int[4];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();

        }
        for (int i = 0; i < arr.length; i++) {
            arr[i]=(arr[i]+5)%10;
        }
        int temp;
        for (int i = 0; i < arr.length/2; i++) {
            temp=arr[i];
            arr[i]=arr[arr.length-1-i];
            arr[arr.length-1-i]=temp;

        }
        printArray(arr);
    }
    public static void printArray(int[] arr){
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print((i!=arr.length-1?arr[i]+",":arr[i]));

        }
        System.out.print("]");
    }
}
