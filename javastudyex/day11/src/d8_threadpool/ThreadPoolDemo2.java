package d8_threadpool;

import java.util.concurrent.*;

public class ThreadPoolDemo2 {
    public static void main(String[] args) throws Exception {
        ExecutorService pool=new ThreadPoolExecutor(3,5,6,
                TimeUnit.SECONDS,new ArrayBlockingQueue<>(5), Executors.defaultThreadFactory(),
                new ThreadPoolExecutor.AbortPolicy());

        Future<String> submit1 = pool.submit(new MyCallable(100));
        Future<String> submit2 = pool.submit(new MyCallable(101));
        Future<String> submit3 = pool.submit(new MyCallable(102));
        Future<String> submit4 = pool.submit(new MyCallable(103));
        Future<String> submit5 = pool.submit(new MyCallable(104));
        Future<String> submit6 = pool.submit(new MyCallable(105));
        Future<String> submit7 = pool.submit(new MyCallable(106));
        System.out.println(submit1.get());
        System.out.println(submit2.get());
        System.out.println(submit3.get());
        System.out.println(submit4.get());
        System.out.println(submit5.get());
        System.out.println(submit6.get());
        System.out.println(submit7.get());


    }
}
