package d9_timer;

import java.util.TimerTask;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class TimerDemo2 {
    public static void main(String[] args) {
        //1 创建ScheduleExecutorService线程池 做定时器
        ScheduledExecutorService pool = Executors.newScheduledThreadPool(3);

        //2 开启定时任务
        pool.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()+"执行输出：aaa");
                try {
                    Thread.sleep(100000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        },3,2, TimeUnit.SECONDS);
        pool.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()+"执行输出：bbb");
                System.out.println(10/0);
            }
        },3,2,TimeUnit.SECONDS);
        pool.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()+"执行输出：ccc");
            }
        },3,2,TimeUnit.SECONDS);
    }
}
