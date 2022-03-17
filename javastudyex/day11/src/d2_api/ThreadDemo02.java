package d2_api;

/**
 * 目标 线程的API
 */
public class ThreadDemo02 {
    //main方法是由主线程负责调度的
    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 5; i++) {
            System.out.println("输出"+i);
            if(i==3){
                Thread.sleep(5000);
            }
        }
    }
}
