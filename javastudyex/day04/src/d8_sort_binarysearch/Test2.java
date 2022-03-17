package d8_sort_binarysearch;

public class Test2 {
    public static void main(String[] args) {
        int[] arr={10,14,16,25,28,30,35,88,100};
        System.out.println(binarySearch(arr,88));
    }

    /**
     * 二分查找的实现
     * @param arr
     * @param data
     * @return 索引 如果元素不存在 直接返回-1
     */
    public static int binarySearch(int[] arr,int data){
        //1定义左右指针
        int left=0,right=arr.length-1;
        //2 开始循环 折半查找
        while (left<=right){
            //取中间索引
            int middleIndex=(left+right)/2;
            if(arr[middleIndex]>data){
                //往左找 索引-1
                right=middleIndex-1;
            }
            else if(arr[middleIndex]<data){
                //往右找 索引+1
                left=middleIndex+1;
            }else{
                return middleIndex;
            }
        }
        return -1;
    }
}
