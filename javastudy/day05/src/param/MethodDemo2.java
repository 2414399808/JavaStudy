package param;

public class MethodDemo2 {
    public static void main(String[] args) {
        //目标 理解引用类型的参数传递机制 值传递 区分其不同点
        int[] ars={10,20,30};
        change(ars);
        System.out.println(ars[2]);
    }
    public static void change(int[] arrs){
        System.out.println(arrs[2]);
        arrs[2]=100;
        System.out.println(arrs[2]);
    }
}
