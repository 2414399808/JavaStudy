package d1_create;

/**
 * 目标 掌握多线程的创建方式一 继承Thread类实现
 */
public class ThreadDemo1 {
    public static void main(String[] args) {
        //3 new 一个线程对象
        Thread t = new MyThread();
        //4 调用start方法启动线程（执行的还是run方法 //这里如果写 t.run()其实就相当于调用了一个方法 不算启动了线程
        t.start();
        for (int i = 0; i < 5; i++) {
            System.out.println("主线程执行输出"+i);

        }

    }
}

/**
 * 1定义一个线程类 一定要继承Thread类
 */
class MyThread extends Thread{
    /**
     * 2 重写run方法 里面是定义线程以后要干嘛
     *
     */
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("子线程执行输出"+i);
        }

    }
}