package d9_abstract_template.after;

/**
    定期账户
 */
public class FixedAccount extends Account{


    public FixedAccount() {
    }

    public FixedAccount(String cardId, double money) {
        super(cardId,money);
    }

    @Override
    protected double calc() {
        double result =  getMoney() * 0.035; // 结算利息了
        if(getMoney() >= 100000){
            result += getMoney() * 0.03;
        }
        return result;
    }

    /**
      登录结算
     */




}
