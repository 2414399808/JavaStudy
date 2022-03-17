package d8_sort_binarysearch;

import java.util.Arrays;

/*
目标 学会使用选择排序的方法对数组进行排序
 */
public class Test {
    public static void main(String[] args) {
        //1定义数组
        int[] arr={5,1,3,2};
        //2定义一个循环控制选择几轮 arr.length-1
        for (int i = 0; i < arr.length-1; i++) {
            for (int i1 = i+1; i1 < arr.length; i1++) {
                if(arr[i1]<arr[i]){
                    int tmp=arr[i1];
                    arr[i1]=arr[i];
                    arr[i]=tmp;
                }
            }

        }
        System.out.println(Arrays.toString(arr));
    }
}
