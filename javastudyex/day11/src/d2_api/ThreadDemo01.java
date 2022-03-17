package d2_api;

/**
 * 目标 线程的API
 */
public class ThreadDemo01 {
    //main方法是由主线程负责调度的
    public static void main(String[] args) {
        Thread t=new MyThread("1号");
//        t.setName("1号");
        System.out.println(t.getName());
        t.start();

        Thread t2=new MyThread("2号");
//        t2.setName("2号");
        System.out.println(t2.getName());
        t2.start();
        //那个线程执行它 他就得到哪个线程对象
        //主线程的名字就叫 main
        Thread m=Thread.currentThread();
        System.out.println(m.getName());
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName()+"主线程输出"+i);
        }
    }
}
