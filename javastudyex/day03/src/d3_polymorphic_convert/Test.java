package d3_polymorphic_convert;

public class Test {
    public static void main(String[] args) {
        //自动类型转换
        Animal a=new Dog();
        a.run();

        //强制类型转换
        Animal a2=new Tortoise();
        a2.run();



        if(a2 instanceof Dog){
            Dog d= (Dog) a;//强制类型转换 编译阶段不报错 （注意 有继承和实现关系编译阶段可以强制 没有问题）
            // 此时 a2是Animal类的对象 Dog是他的子类 所以编译阶段不会出错 但是运行时 可能出错！
            d.run();
            d.lookDoor();
        }
        else{
            Tortoise t=(Tortoise) a2;//从父类类型到子类类型 必须强制类型转换
            t.egg();
            System.out.println(t.name);
        }
    }
}
