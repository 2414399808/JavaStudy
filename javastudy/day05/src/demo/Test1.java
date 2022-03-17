package demo;

public class Test1 {
    public static void main(String[] args) {
        //需求 使用方法计算1-n的和并返回
        System.out.println(sum(100));
    }
    public static int sum(int n){
        int sum=0;
        for (int i = 0; i <=n ; i++) {

            sum+=i;
        }
        return sum;
    }
}
