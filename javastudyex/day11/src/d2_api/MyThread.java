package d2_api;

public class MyThread extends Thread{
    public MyThread(String name) {
        //调用父类构造器 为当前线程对象设置名称
        super(name);
    }

    public MyThread() {
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName()+"子线程输出"+i);
        }
    }
}
