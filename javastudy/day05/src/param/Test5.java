package param;

public class Test5 {
    public static void main(String[] args) {
        int[] arr1={1,2,3,4};
        int[] arr2={1,2,3,4};
        System.out.println(judge(arr1,arr2));
    }
    public static boolean judge(int[] arr1,int[] arr2){
        if(arr1.length!=arr2.length)
        {
            return false;
        }
        else{
            for (int i = 0; i < arr1.length; i++) {
                if(arr1[i]!=arr2[i])
                    return false;

            }
        }
        return true;
    }
}
