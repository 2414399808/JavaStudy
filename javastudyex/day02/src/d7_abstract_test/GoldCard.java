package d7_abstract_test;

public class GoldCard extends Card{

    @Override
    public void pay(double money) {
        double rs=0.8*money;
        double lastmoney=getMoney()-rs;
        System.out.println(getName()+"当前账户总金额"+getMoney()+"当前消费了"+rs+"消费后余额为"+lastmoney);
        setMoney(lastmoney);
    }
}
