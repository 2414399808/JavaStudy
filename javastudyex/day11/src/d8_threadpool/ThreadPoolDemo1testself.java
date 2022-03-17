package d8_threadpool;

import java.util.concurrent.*;

public class ThreadPoolDemo1testself {
    public static void main(String[] args) {
        ExecutorService pool =new ThreadPoolExecutor(3,5,6
                , TimeUnit.SECONDS,new ArrayBlockingQueue<>(5), Executors.defaultThreadFactory(),
                new ThreadPoolExecutor.AbortPolicy());

        Runnable target =new MyRunnable();
        pool.execute(target);
        pool.execute(target);
        pool.execute(target);
        pool.execute(target);
        pool.execute(target);
        pool.execute(target);
        pool.execute(target);
    }
}
