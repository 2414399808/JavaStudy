package d8_threadpool;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 目标 使用Executors的工具方法直接得到一个线程池对象
 */
public class ThreadPoolDemo3 {
    public static void main(String[] args) {
        //1创建固定线程数量的线程池
        //任务队列没有限制 扛不住大量任务
        ExecutorService pool = Executors.newFixedThreadPool(3);
        pool.execute(new MyRunnable());
        pool.execute(new MyRunnable());
        pool.execute(new MyRunnable());
        pool.execute(new MyRunnable());//没有多余线程了
    }
}
