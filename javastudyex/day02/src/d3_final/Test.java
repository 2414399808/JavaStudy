package d3_final;
/*
目标 明白 final 一些借本语法知识
 */
public class Test {
    //属于类 只加载一次 可以共享(常量)
    public static final String schoolName ="heima";
    public static final String schoolName2;
    static{
        schoolName2="ahut";
    }
    //属于对象(final 基本不会用来修饰实例成员变量
    private final String name="王麻子";
    public static void main(String[] args) {
    // final 修饰变量 变量有且仅能被赋值一次
        /*
        变量有几种：
        局部变量
        成员变量：
            1 静态成员变量
            2 实例成员变量
         */
        final int age;
        age=12;
        //不能被第二次赋值
//        age=20;
    }

}
/**
 * final 修饰类 该类不能被继承
 */
//final class Animal{
//
//}
//class Cat extends Animal{
//
//}
/**
 * final 修饰方法 方法不能被重写
 */
//class Animal{
//    final public void run(){
//        System.out.println("动物可以跑");
//    }
//}
//class tiger extends Animal{
//    @Override
//    public void run(){
//        System.out.println("老虎可以跑");
//    }
//}