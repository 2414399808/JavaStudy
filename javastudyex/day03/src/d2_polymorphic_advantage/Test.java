package d2_polymorphic_advantage;

public class Test {
    public static void main(String[] args) {
       Animal d=new Tortoise();
       go(d);
       Animal d2=new Dog();
       go(d2);
//       d2.lookDoor()//多态下 对象不能调用子类的独有功能 因为使用父类接收的子类对象
//       编译看父类 运行看子类  此时编译的父类没有子类中独有功能的抽象方法 所以不能调用

    }
    /**
     * 要求 所有动物都可以进来比赛
     */

    public static void go(Animal animal){
        System.out.println("开始。。。");
        animal.run();
        System.out.println("结束。。。");
    }
}
