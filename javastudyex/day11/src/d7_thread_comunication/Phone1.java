package d7_thread_comunication;

public class Phone1 {
    private boolean flag=false;
    public void run(){



        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    while(true){
                        synchronized (Phone1.this){
                            if(!flag){
                                System.out.println("有电话近来了");
                                flag=true;
                                Phone1.this.notify();
                                Phone1.this.wait();
                            }
                        }
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    while(true){
                        synchronized (Phone1.this){
                            if(flag){
                                System.out.println("通信中");
                                Thread.sleep(5000);
                                flag=false;
                                Phone1.this.notify();
                                Phone1.this.wait();
                            }
                            else{
                                Phone1.this.notify();
                                Phone1.this.wait();
                            }
                        }
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        }).start();


    }
    public static void main(String[] args) {
        Phone1 p1=new Phone1();
        p1.run();
    }
}
