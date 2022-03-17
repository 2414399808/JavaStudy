package d9_abstract_template.after;

public abstract class Account {
    private String cardId;
    private double money;

    public Account() {
    }

    public Account(String cardId, double money) {
        this.cardId = cardId;
        this.money = money;
    }

    /**
     登录结算利息
     */
    // 这个handle是模板方法 模板方法推荐用final修饰 因为模板方法是直接给 子类使用的 子类不需要修改 所以才叫模板方法
    public final void handle(String loginName , String passWord ){
        // a.判断登录是否成功
        if("itheima".equals(loginName) && "123456".equals(passWord)){
            System.out.println("登录成功。。");
            // b.正式结算利息
            double result =  calc();
            // c.输出利息详情
            System.out.println("本账户利息是："+ result);
        }else{
            System.out.println("用户名或者密码错误了");
        }
    }

    protected abstract double calc();


    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }
}
