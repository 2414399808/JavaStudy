package d3_thread_safe;

/**
 * 需求 模拟取钱案例 。
 */
public class ThreadDemo {
    public static void main(String[] args) {
        //1 定义线程类 创建一个账户对象
        Account acc=new Account("ICBC-111",100000.0);

        //2 创建两个线程对象 代表两个线程对象 代表小明和小红同时进来了
        new DrawThread(acc,"小明").start();
        new DrawThread(acc,"小红").start();
    }
}
