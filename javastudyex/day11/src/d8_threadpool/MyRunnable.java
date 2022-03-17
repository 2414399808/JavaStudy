package d8_threadpool;

public class MyRunnable implements Runnable{


    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName()+"线程输出:Hello,World"+i);
        }
            try {
                System.out.println(Thread.currentThread().getName()+"本任务与线程绑定，线程进入休眠了");
                Thread.sleep(100000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
    }
}
