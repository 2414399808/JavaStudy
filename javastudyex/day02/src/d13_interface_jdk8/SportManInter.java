package d13_interface_jdk8;

public interface SportManInter {
    /*
    jdk8新增了默认方法
    --必须用default修饰 默认用public修饰
    --默认方法接口不能创建对象 这个方法只能过继给实现类 由实现类的对象调用
     */
    default void run(){
        System.out.println("跑的很快");
        go();
    }
    /*
    静态方法
    必须使用static修饰 默认用public修饰
    --接口的静态方法 必须接口名自己调用
     */
    static void inAddr(){
        System.out.println("我们都在学习java新增方法的语法");

    }
    /*
    私有方法 -- jdk1.9才开始支持
    --必须在接口内部才能被访问
     */
    private void go(){
        System.out.println("接口实现私有方法调用");
    }
}
