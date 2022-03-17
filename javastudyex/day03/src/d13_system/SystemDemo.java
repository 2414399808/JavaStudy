package d13_system;

import java.util.Arrays;

public class SystemDemo {
    public static void main(String[] args) {
        System.out.println("程序开始");
//        System.exit(0);
        //计算机认为时间有起源 返回1970 1 1 00：00：00 走到刺客的总的毫秒值 时间毫秒值
        long time = System.currentTimeMillis();
        System.out.println(time);
        //进行时间的计算 性能分析
        for (int i = 0; i < 100000; i++) {
            System.out.println(i);

        }
        long time2 = System.currentTimeMillis();
        System.out.println((time2-time)/1000.0);

        //作数组拷贝
        int[] arr1={111,222,333,444,555,666,777};
        int[] arr2=new int[6];//[0,0,444,555,666,0]
        System.arraycopy(arr1,3,arr2,2,3);
        System.out.println(Arrays.toString(arr2));
    }
}
