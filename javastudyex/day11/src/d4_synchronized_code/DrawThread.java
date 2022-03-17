package d4_synchronized_code;

/**
 * 取钱的线程类
 */
public class DrawThread extends Thread{
    private Account account;



    public DrawThread(Account account, String s) {
        super(s);
        this.account=account;
    }


    @Override
    public void run() {
        //小明 小红取钱
        account.drawMoney(100000);
    }
}
