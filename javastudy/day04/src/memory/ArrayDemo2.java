package memory;

public class ArrayDemo2 {
    public static void main(String[] args) {
        //目标 理解两个数组变量指向同一个数组对象
        int[] arr1={11,22,33,44,55};
        int[] arr2=arr1;
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);

        }
    }
}
