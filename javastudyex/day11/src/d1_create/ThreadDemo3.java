package d1_create;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * 目标 学会线程的创建方式三 实现Callable接口 结合FutureTask完成
 */
public class ThreadDemo3 {
    public static void main(String[] args) {
        //3 创建Callable任务对象
        Callable<String> callable1 = new MyCallable(6);
        //4 需要把Callable任务对象封装成FutureTask对象
        //FutureTask对象的作用1 是Runable的实现类的对象 所以可以交给 线程对象
        //FutureTask对象的作用2 在线程执行完毕之后 通过调用其方法得到线程执行完成的结果
        FutureTask<String> f1=new FutureTask<>(callable1);
        //5 交给线程处理
        Thread t1= new Thread(f1);
        //6 启动线程
        t1.start();

        Callable<String> callable2=new MyCallable(10);
        FutureTask<String> f2=new FutureTask<>(callable2);
        Thread t2=new Thread(f2);
        t2.start();

        try {
            //如果f1任务没有执行完毕 这里的代码会等待 直到线程1跑完才提取结果
            String s1 = f1.get();
            System.out.println("第一个结果是"+s1);
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
        try {
            String s2 = f2.get();
            System.out.println("第二个结果是"+s2);
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
    }
}

/**
 * 1 定义一个任务类 实现Callable接口 应该申明任务执行完毕后的结果的数据类型
 */
class MyCallable implements Callable<String>{
    private int n;

    public MyCallable(int n) {
        this.n = n;
    }

    /**
     * 2 重写call方法(线程的任务方法
     * @return
     * @throws Exception
     */

    @Override
    public String call() throws Exception {

        int sum=0;
        for (int i = 0; i < n; i++) {
            sum+=i;

        }
        return "子线程的执行结果是"+sum;
    }
}
