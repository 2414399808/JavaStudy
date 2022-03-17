package d1_create;

/**
 * 目标 学会线程的创建方式二 理解他的优缺点
 */
public class ThreadDemo2 {
    public static void main(String[] args) {
        //3 创建一个任务对象
        Runnable target=new MyRunnable();
        //4 把任务对象交给Thread处理
        Thread t=new Thread(target);
//        Thread t1=new Thread(target,"mingzi");
        //5 启动线程
        t.start();
        long start = System.currentTimeMillis();
        for (int i = 0; i < 5; i++) {
            System.out.println("主线程执行输出"+i);

        }
        long end = System.currentTimeMillis();
        System.out.println("主"+(end-start)/1000.0);
    }
}
/**
 * 1 定义一个线程任务类 实现Runnable接口
 */
class MyRunnable implements Runnable{


    /**
     * 2 重写run方法 定义线程的执行任务
     */
    @Override
    public void run() {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 5; i++) {
            System.out.println("子线程执行输出"+i);

        }
        long end = System.currentTimeMillis();
        System.out.println("子"+(end-start)/1000.0);
    }
}
