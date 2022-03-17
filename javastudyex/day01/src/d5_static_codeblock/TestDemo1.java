package d5_static_codeblock;

public class TestDemo1 {

    public static String schoolName;
    // 目标 学习静态代码块的特点和基本作用
    /*
    特点 与类一起加载 自动触发一次 优先执行
    作用 可以在程序加载时进行静态数据的初始化操作（准备）
     */
    static{
        System.out.println("==静态代码块呗触发执行==");
        schoolName="ahut";
    }

    public static void main(String[] args) {
        System.out.println("===============main==============");
        System.out.println(schoolName);
    }
}
