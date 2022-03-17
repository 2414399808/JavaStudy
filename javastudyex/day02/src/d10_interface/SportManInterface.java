package d10_interface;
/*
接口
 */
public interface SportManInterface {
    //jdk1.8之前只有常量 和抽象方法
    //public static final 可以省略
//    public static final String SCHOOL_NAME="黑马";
    String SCHOOL_NAME="黑马";
    //2 抽象方法
    //public abtract 可以省略不屑 接口默认会为你加上
//    public abstract void run();
      void run();
      void eat();
}
