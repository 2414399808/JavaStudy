package d14_interface_attention;

public class Test {
    public static void main(String[] args) {
        //        1、接口不能创建对象(接口更加彻底的抽象)

//        2、一个类实现多个接口，多个接口中有同样的静态方法不冲突。(java规定接口中的静态方法只能用自己调，实现了此接口的实现类不能直接用他段类名调)


//        3、一个类继承了父类，同时又实现了接口，父类中和接口中有同名方法，默认用父类的。

//        4、一个类实现了多个接口，多个接口中存在同名的默认方法，不冲突，这个类重写该方法即可。

//        5、一个接口继承多个接口，是没有问题的，如果多个接口中存在规范冲突则不能多继承。
    }
}
//        2、一个类实现多个接口，多个接口中有同样的静态方法不冲突。(java规定接口中的静态方法只能用自己调，实现了此接口的实现类不能直接用他段类名调)
interface A{
    static void test(){
        System.out.println("A");
    }
}
interface B{
    static void test(){
        System.out.println("B");
    }
}
class C extends D implements A,B{
    public static void main(String[] args) {
//        C.test();
        C.d();
    }
}
class D{
    static void d(){
        System.out.println("D");
    }
}
//        3、一个类继承了父类，同时又实现了接口，父类中和接口中有同名方法，默认用父类的。
class Animal{
    public void eat(){
        System.out.println("父类动物吃");
    }
}
interface Food{
    default void eat(){
        System.out.println("接口吃");
    }
}
class Cat extends Animal implements Food{
    public static void main(String[] args) {
        Cat cat=new Cat();
        cat.eat();
    }
}
//        4、一个类实现了多个接口，多个接口中存在同名的默认方法，不冲突，这个类重写该方法即可。
interface AA{
    default void go(){
        System.out.println("aa");
    }
}
interface BB{
    default void go(){
        System.out.println("bb");
    }
}
class CC implements AA,BB{

    @Override
    public void go() {
        AA.super.go();
    }
}
//        5、一个接口继承多个接口，是没有问题的，如果多个接口中存在规范冲突则不能多继承。
//interface AAA{
//  void run();
//}
//interface BBB{
//    String run();
//}
//interface CCC extends AAA,BBB{
//    static void CC(){
//
//    }
//}