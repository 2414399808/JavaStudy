package demo;

public class Test3 {
    public static void main(String[] args) {
        int[] arr={15,9000,10000,20000,9500,-15};
        System.out.println(max(arr));
    }
    public static int max(int[] arr){
        int max=arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]>max)
                max=arr[i];

        }
        return max;
    }
}
