package d9_abstract_template.after;

/**
  活期账户
 */
public class CurrentAccount extends Account{


    public CurrentAccount() {
    }

    public CurrentAccount(String cardId, double money) {
       super(cardId,money);
    }

    @Override
    protected double calc() {
        return getMoney() * 0.0175;
    }

    /**
     登录结算利息
     */




}
