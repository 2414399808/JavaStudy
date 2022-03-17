package d6_abstract_class;

public abstract class Animal {
    //abstract
    //抽象类是用来被继承的 抽象方法是交给子类重写实现的。
    //一个类如果继承了抽象类 那么这个类必须重写完成抽象类的全部抽象方法 否则这个类也必须定义成抽象类
    // 抽象类中可以定义自己的功能 但是有不确定的功能可以不实现 把他设置成抽象方法 让他的子类实现他
    //不能直接创建抽象类的对象 因为抽象类中有抽象方法 只可以创建 继承了此抽象类的子类(且此子类一定要完成该抽象类里的所有抽象方法)的对象
    public abstract void run();
    public void spark(){
        System.out.println("动物会叫");
    }
}
