package param;

public class MethodDemo1 {
    public static void main(String[] args) {
        //目标理解java的基本类型的参数传递 值传递
        int a=10;
        change(a);
        System.out.println(a);

    }
    public static void change(int a){
        System.out.println(a);
        a=20;
        System.out.println(a);
    }
}
