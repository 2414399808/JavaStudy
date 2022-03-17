package d8_threadpool;

import java.util.concurrent.*;

public class ThreadPoolDemo1Test {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService pool=new ThreadPoolExecutor(3,5,6,
                TimeUnit.SECONDS,new ArrayBlockingQueue<>(5), Executors.defaultThreadFactory(),
                new ThreadPoolExecutor.AbortPolicy());
        Runnable target=new MyRunnable();
        Future<String> submit = pool.submit(new MyCallable(100));
        Future<String> submit1 = pool.submit(new MyCallable(100));
        Future<String> submit2= pool.submit(new MyCallable(100));
        Future<String> submit3 = pool.submit(new MyCallable(100));
        Future<String> submit4= pool.submit(new MyCallable(100));
        System.out.println(submit.get());
        System.out.println(submit1.get());
        System.out.println(submit2.get());
        System.out.println(submit3.get());
        System.out.println(submit4.get());


    }
}
