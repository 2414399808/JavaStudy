package d7_thread_comunication;

/**
 * 目标 模拟线程通信 来电提醒线程 接电话线程（了解思想即可 代码不重要）
 */
public class Phone {
    //实现线程中通信 默认认为手机当前处于等待来电提醒
    private boolean flag=false;

    public void run(){
        //1 负责来电提醒的线程
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    while(true){
                        synchronized (Phone.this){
                            if(!flag){
                                //代表来电提醒
                                System.out.println("您好有新电话呼入，请接听");
                                flag=true;
                                Phone.this.notify();
                                Phone.this.wait();
                            }
                        }
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }).start();

        //2 接电话线程 正式接听了
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    while(true){
                        synchronized (Phone.this){
                            if(flag){
                                //可以接听电话了
                                System.out.println("开始接听中，通信5分钟结束了");
                                Thread.sleep(5000);
                                flag=false;
                                //等待自己唤醒别人
                                Phone.this.notify();
                                Phone.this.wait();
                            }else{
                                Phone.this.notify();
                                Phone.this.wait();
                            }
                        }
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }

    public static void main(String[] args) {
        //1 创建一部手机对象
        Phone huawei=new Phone();
        huawei.run();// 开机了
    }
}
