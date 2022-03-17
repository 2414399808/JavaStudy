package d2_recusion;

/**
 * 递归的形式
 */
public class RecusionDemo01 {
    public static void main(String[] args) {
        test2();
    }
    public static void test(){
        System.out.println("=================test=======================");
        test();
    }
    public static void test2(){
        System.out.println("=================test2=======================");
        test3();
    }
    public static void test3(){
        System.out.println("=================test3=======================");
        test2();
    }
}
