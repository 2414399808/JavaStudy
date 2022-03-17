package d7_Arrays;

import java.util.Arrays;

public class ArraysDemo1 {
    public static void main(String[] args) {
        //目标 ：学会使用Arrays类的常用api 并理解期其原理
        //1 返回数组内容的toString方法
        int[] arr={10,2,34,12,55,77,100};
        System.out.println(Arrays.toString(arr));
        //2 排序的api（默认自动对数组元素进行升序排序）sort 方法不是返回一个数组 而是直接把数组本身改变
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        //3 二分搜索技术(数据必须排好序 才支持 否则报错)
        //返回不存在元素的规律 -（应该插入的位置索引）-1
        int i = Arrays.binarySearch(arr, 34);
        System.out.println(i);

        int[] arr2={12,36,34,25,234,11,356,100};
        Arrays.sort(arr2);
        System.out.println(Arrays.binarySearch(arr2,36));
    }
}
