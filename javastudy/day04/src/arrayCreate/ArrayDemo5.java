package arrayCreate;

public class ArrayDemo5 {
    public static void main(String[] args) {
        //目标 掌握动态初始化元素默认值的规则
        //1整型数组的元素默认值都是0 实性数组的元素默认值都是0.0 引用型数据类型的默认值都是null
        int[] arr=new int[5];
        double[] arr2 =new double[5];
        boolean[] lll=new boolean[2];
        System.out.println(lll[0]);
        String[] arr3 =new String[5];
        for (int i = 0; i < 5; i++) {
            System.out.println(arr[0]);
            System.out.println(arr2[0]);
            System.out.println(arr3[0]);

        }
    }
}
