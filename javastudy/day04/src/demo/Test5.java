package demo;

public class Test5 {
    public static void main(String[] args) {
        //1 定义一个数组存储数据
        int [] arr={5,2,3,1};
        for (int i = 1; i <arr.length; i++) {
            int temp;
            for(int j=0;j<arr.length-i;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);

        }
    }
}
