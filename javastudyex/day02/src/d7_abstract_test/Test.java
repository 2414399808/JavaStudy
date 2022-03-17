package d7_abstract_test;

public class Test {
    public static void main(String[] args) {
        GoldCard goldCard=new GoldCard();
        goldCard.setName("zsh");
        goldCard.setMoney(10000);
        goldCard.pay(1000);
        goldCard.pay(500);
    }
}
