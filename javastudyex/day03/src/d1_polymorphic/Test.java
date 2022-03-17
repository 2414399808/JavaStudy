package d1_polymorphic;

/**
 * 目标多态
 */
public class Test {
    public static void main(String[] args) {
        //1 多态的形式 父类类型 对象名称 = new 子类构造器；
        Animal a=new Dog();
        a.run();//编译看左边 运行看右边
        System.out.println(a.name);//对于变量的调用 编译看左 运行也看左
        Animal a2=new Tortoise();
        if(a2 instanceof Dog){
            System.out.println("不对");
        }
        else{
            a2.run();
            System.out.println(a2.name);
        }

    }
}
