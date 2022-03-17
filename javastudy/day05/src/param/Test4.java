package param;

import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) {
        //需求从整形数组中查询某个数据的索引返回 不存在该数据返回-1
        int[] arr={11,22,33,44};
        System.out.println(judge(arr));
    }
    public static int judge(int[] arr){
        Scanner sc=new Scanner(System.in);
        int guess=sc.nextInt();
        for (int i = 0; i < arr.length; i++) {
            if(guess==arr[i])
                return i;

        }
        return -1;
    }
}
