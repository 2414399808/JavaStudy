package d3_static_test;

public class ArrayUtils {
    private ArrayUtils() {
    }

    public static String toString(int[] arr) {
       if(arr==null){
          return null;
       }
       else{
           String result = "[";
           for (int i = 0; i < arr.length; i++) {
               result += i == arr.length - 1 ? arr[i] : arr[i] + ",";

           }
           result += "]";
           return result;
       }
    }
    public static double getAverage(int[] arr){
        int max=arr[0];
        int min=arr[0];
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>max)
                max=arr[i];
            if(arr[i]<min){
                min=arr[i];
            }

        }
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];

        }
        return (sum-max-min)*1.0/(arr.length-2);
    }
}
