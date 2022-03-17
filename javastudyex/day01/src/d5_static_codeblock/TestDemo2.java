package d5_static_codeblock;

public class TestDemo2 {
    /*
    属于对象的 与对象一起加载 自动触发执行
     */
    {
        System.out.println("==构造代码块呗执行==");
    }

    public TestDemo2() {
        System.out.println("==构造器被触发执行==");
    }

    public static void main(String[] args) {
        TestDemo2 t2=new TestDemo2();

    }
}
