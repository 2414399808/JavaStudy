package Test;


import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class ThreadDemo1{
    public static void main(String[] args) throws ExecutionException, InterruptedException {
     Callable<String> target=new MyCallable();
        FutureTask<String> f=new FutureTask<>(target);
        Thread t=new Thread(f,"线程名字");
        t.start();

        System.out.println("主线程开始");
        System.out.println(f.get());

    }
}
class MyThread extends  Thread{
    @Override
    public void run() {
        System.out.println("子线程开始");
    }
}
class Myrunnable implements Runnable{

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"子线程开始");
    }
}
class MyCallable implements Callable<String>{

    @Override
    public String call() throws Exception {
        return Thread.currentThread().getName()+"子线程运行";
    }
}
