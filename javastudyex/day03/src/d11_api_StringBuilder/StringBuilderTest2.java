package d11_api_StringBuilder;

public class StringBuilderTest2 {
    public static void main(String[] args) {
        int[] arr={111,222,333,444};
        System.out.println(pin(arr));
    }
    public static String pin(int[] arr){
        if(arr==null){
            return null;
        }
        StringBuilder sb=new StringBuilder("[");
        for (int i = 0; i < arr.length; i++) {
            sb.append(i==arr.length-1?arr[i]:arr[i]+",");

        }
        sb.append("]");
        return sb.toString();
    }
}
