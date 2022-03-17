package param;

public class Test3 {
    public static void main(String[] args) {
        //需求 打印任意整型数据的内容
        int[] arr = null;
        printArray(arr);
    }

    public static void printArray(int[] arr) {
        if (arr != null) {


            System.out.print("[");
            for (int i = 0; i < arr.length; i++) {
//            if(i!=arr.length-1)
//            System.out.print(arr[i]+", ");
//            else
//                System.out.print(arr[i]);
                System.out.print(i == arr.length - 1 ? arr[i] : arr[i] + ",");
            }

            System.out.println("]");
        }
    }
}
