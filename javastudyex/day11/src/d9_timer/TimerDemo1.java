package d9_timer;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * 目标 Timer定时器的使用和了解
 */
public class TimerDemo1 {
    public static void main(String[] args) {
        //1 创建Timer定时器
        Timer timer=new Timer();//定时器本身就是一个线程
        //2 调用方法 处理器定时任务
//        timer.schedule(new TimerTask() {
//            @Override
//            public void run() {
//                System.out.println(Thread.currentThread().getName()+"执行一次111"+new Date());
//                try {
//                    Thread.sleep(5000);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//            }
//        },3000,2000);
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()+"执行一次222"+new Date());
                System.out.println(10/0);
            }
        },3000,2000);
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()+"执行一次222"+new Date());
            }
        },3000,3000);
    }
}
