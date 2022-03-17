package d6_singleinstance;
/*
目标 学会使用懒汉单例模式设计单例类
 */
public class SingleInstance2 {
    /**
     * 2.创建一个静态成员变量存储本类的对象 注意 此时不能初始化对象
     */

    private static SingleInstance2 singleInstance2;
    /*
    1 私有构造器
     */
    private SingleInstance2(){

    }
    /*
    3 定义一个方法 让其他地方可以来调用获取一个对象
     */
    public static SingleInstance2 getInstance(){
        if(singleInstance2==null) {
            singleInstance2 = new SingleInstance2();
        }
        return singleInstance2;
    }
}
