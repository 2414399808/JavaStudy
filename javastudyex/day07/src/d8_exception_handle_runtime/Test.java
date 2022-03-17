package d8_exception_handle_runtime;
/*
目标 运行时异常的处理机制
可以不处理 编译阶段又不报错
按照理论规则 建议还是处理 只需要在最外层捕获处理
 */
public class Test {
    public static void main(String[] args) {
        System.out.println("程序开始。。。。。。。。。。。。。。。");
        try {
            chu(6,0);
        } catch (Exception e) {
            System.out.println("除零错误");
            e.printStackTrace();
        }
        System.out.println("程序结束。。。。。。。。。。。。。。。");
    }
    public static void chu(int a,int b){

        System.out.println(a);
        System.out.println(b);
        int c=a/b;
        System.out.println(c);
    }
}
