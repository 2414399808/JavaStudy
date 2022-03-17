package d4_static_attention;

public class Test {

    public static int onLineNumber;
    private String name;
    public static void getMax(){
        //1 静态方法可以直接访问静态成员
        System.out.println(onLineNumber);
        System.out.println(Test.onLineNumber);
        inAddr();
        //3 静态方法中不能出现this关键字 因为 this表示当前实例对象 而静态方法被使用必须满足没有创建实例对象也可以使用 所以不可以出现this
    }
    public void run(){
        //2 实例方法可以直接访问静态方法
        System.out.println(onLineNumber);
        System.out.println(Test.onLineNumber);
        System.out.println(name);
        sing();
    }
    public static void inAddr(){
        System.out.println("我们在黑马程序员");

    }
    public void sing(){
        System.out.println("sing");
    }

    public static void main(String[] args) {

    }
}
