package projectTest;

public class Account {
    private String cardId;
    private String userName;
    private String passWord;
    private double money;
    private double quotomoney;

    public Account() {
    }

    @Override
    public String toString() {
        return "Account{" +
                "cardId='" + cardId + '\'' +
                ", userName='" + userName + '\'' +
                ", passWord='" + passWord + '\'' +
                ", money=" + money +
                ", quotomoney=" + quotomoney +
                '}';
    }

    public Account(String cardId, String userName, String passWord,  double quotomoney) {
        this.cardId = cardId;
        this.userName = userName;
        this.passWord = passWord;
        this.quotomoney = quotomoney;
    }

    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public double getQuotomoney() {
        return quotomoney;
    }

    public void setQuotomoney(double quotomoney) {
        this.quotomoney = quotomoney;
    }
}
