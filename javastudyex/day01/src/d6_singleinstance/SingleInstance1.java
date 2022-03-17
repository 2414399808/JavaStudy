package d6_singleinstance;
/*
目标 学会饿汉单例方式定义单例类
 */
public class SingleInstance1 {
    /*
    2 定义一个公开的静态的成员变量存储一个类的对象
    饿汉 在这里加载静态变量的时候就会创建了。
     */
    public static SingleInstance1 singleInstance1=new SingleInstance1();
    /*
    1 把构造器私有
     */
    private SingleInstance1(){

    }
}
