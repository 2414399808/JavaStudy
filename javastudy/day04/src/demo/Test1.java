package demo;

public class Test1 {
    public static void main(String[] args) {
        //实现数组元素求和
        int sum=0;
        int[] arr={111,555,766756,44645,64464,56454345};
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];

        }
        System.out.println(sum);
    }
}
