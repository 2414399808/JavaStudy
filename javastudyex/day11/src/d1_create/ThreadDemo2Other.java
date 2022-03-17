package d1_create;

/**
 * 目标 学会线程的创建方式二 (匿名内部类方法实现 语法实现)
 */
public class ThreadDemo2Other {
    public static void main(String[] args) {
        //3 创建一个任务对象

        //4 把任务对象交给Thread处理
        Thread t=new Thread(new Runnable() {
            @Override
            public void run() {
                long start = System.currentTimeMillis();
                for (int i = 0; i < 5; i++) {
                    System.out.println("子线程执行输出"+i);

                }
                long end = System.currentTimeMillis();
                System.out.println("子"+(end-start)/1000.0);
            }
        });
        //5 启动线程
        t.start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 5; i++) {
                    System.out.println("子线程2执行输出"+i);

                }
            }
        }).start();
        new Thread(() ->{
                for (int i = 0; i < 5; i++) {
                    System.out.println("子线程3执行输出"+i);

                }

        }).start();
        long start = System.currentTimeMillis();
        for (int i = 0; i < 5; i++) {
            System.out.println("主线程执行输出"+i);

        }
        long end = System.currentTimeMillis();
        System.out.println("主"+(end-start)/1000.0);
    }
}



