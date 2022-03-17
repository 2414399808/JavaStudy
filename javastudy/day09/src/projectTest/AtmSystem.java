package projectTest;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class AtmSystem {
    public static void main(String[] args) {
        ArrayList<Account> accounts = new ArrayList<>();
        showMain(accounts);
    }

    public static void showMain(ArrayList<Account> accounts) {
        System.out.println("===============欢迎进入首页===============");
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请你输入想做的操作");
            System.out.println("1 登录");
            System.out.println("2 开户");
            System.out.println("你可以开始输入了:");
            int command = sc.nextInt();
            switch (command) {
                case (1):
                    login(accounts,sc);
                    break;
                case (2):
                    register(accounts, sc);
                    break;
                default:
                    System.out.println("没有该指令！请重新输入");
            }
        }

    }

    private static void login(ArrayList<Account> accounts, Scanner sc) {
        if(accounts.size()==0){
            System.out.println("当前没有任何账户，请创建一个账户！");
            return;
        }
        while (true) {
            System.out.println("请输入卡号：");
            String cardId = sc.next();
            Account accountByCardId = getAccountByCardId(cardId, accounts);
            if(accountByCardId!=null) {
                while (true) {
                    System.out.println("请输入用户名:");
                    String username = sc.next();
                    System.out.println("请输入密码：");
                    String password = sc.next();
                    if (username.equals(accountByCardId.getUserName()) ) {
                        if(password.equals(accountByCardId.getPassWord())){
                            System.out.println("恭喜你，"+accountByCardId.getUserName()+"先生/女士登陆成功");
                            showUserCommand(accounts,accountByCardId,sc);
                            return;
                        }else{
                            System.out.println("密码错误，请重新输入：");
                        }
                    } else {
                        System.out.println("用户名错误，请重新输入：");
                    }
                }
            }else{
                System.out.println("不存在该卡号，请重新输入卡号");
            }
        }
    }

    private static void showUserCommand(ArrayList<Account> accounts, Account account, Scanner sc) {
        while (true) {
            System.out.println("================用户操作界面===============");
            System.out.println("1 查询账户");
            System.out.println("2 存款");
            System.out.println("3 取款");
            System.out.println("4 转账");
            System.out.println("5 修改密码");
            System.out.println("6 退出");
            System.out.println("7 注销账户");
            System.out.println("请您输入操作命令：");
            int command = sc.nextInt();
            switch (command){
                case(1):
                    showAccount(account);
                    break;
                case(2):
                    depositMoney(account,sc);
                    break;
                case(3):
                    drawMoney(account,sc);
                    break;
                case(4):
                    transferMoney(accounts,account,sc);
                    break;
                case(5):
                    updatePassword(account,sc);
                    return;
                case(6):
                    System.out.println("欢迎下次光临");
                    return;
                case(7):
                    accounts.remove(account);
                    System.out.println("销户成功！");
                    return;
                default:
                    System.out.println("没有该指令！");
            }
        }
    }

    private static void updatePassword(Account account, Scanner sc) {
        System.out.println("===================修改密码=====================");
        while (true) {
            System.out.println("输入当前密码：");
            String password = sc.next();
            if(password.equals(account.getPassWord())){
                while (true) {
                    System.out.println("请输入新密码：");
                    String newPassword = sc.next();
                    System.out.println("再次输入新密码：");
                    String newPassword2 = sc.next();
                    if(newPassword.equals(newPassword2)){
                        account.setPassWord(newPassword);
                        System.out.println("修改密码成功");
                        return;
                    }
                    else{
                        System.out.println("第二次输入密码有误");
                    }
                }
            }else{
                System.out.println("密码输入有误");
            }
        }
    }

    private static void transferMoney(ArrayList<Account> accounts, Account account, Scanner sc) {
        System.out.println("===================转钱操作=====================");
        if(accounts.size()<2){
            System.out.println("当前不足两个账户，无法实现转账");
        }else{
            System.out.println("请输入转账卡号:");
            String cardId = sc.next();

            Account accountByCardId = getAccountByCardId(cardId, accounts);
            if(accountByCardId==null){
                System.out.println("当前账户不存在，无法实现转账");
            }else{
                if(account.getCardId().equals(cardId)){
                    System.out.println("不能给自己转账");
                }else {
                    String newName="*"+accountByCardId.getUserName().substring(1);
                    while (true) {
                        System.out.println("请输入"+newName+"的姓：");
                        String xing = sc.next();
                        if(accountByCardId.getUserName().startsWith(xing)){
                            while (true) {
                            System.out.println("请输入转账金额：");
                            double money = sc.nextDouble();
                                if (account.getMoney() < money) {
                                    System.out.println("您的账户余额不足，无法完成转账！您最多可以转"+account.getMoney());
                                } else {
                                    account.setMoney(account.getMoney() - money);
                                    accountByCardId.setMoney(accountByCardId.getMoney() + money);
                                    System.out.println("转账成功，转账金额为"+money+"您的余额为" + account.getMoney());
                                    return;
                                }
                            }
                        }else{
                            System.out.println("姓氏输入出错");
                        }
                    }
                }
            }
        }
    }

    private static void drawMoney(Account account, Scanner sc) {
        while (true) {
            System.out.println("===================取钱操作=====================");
            if(account.getMoney()>=100){
                System.out.println("请您输入取款金额：");
                double money = sc.nextDouble();
                if(money>account.getMoney())
                {
                    System.out.println("账户中余额不足");

                }
                else{
                    if(money>account.getQuotomoney()){
                        System.out.println("超过单词限额");
                    }
                    else{
                        account.setMoney(account.getMoney()-money);
                        System.out.println("取款成功，您的余额是："+account.getMoney());
                        return;
                    }
                }
            }else{
                System.out.println("您的账户不足100元");
            }
        }

    }

    private static void depositMoney(Account account, Scanner sc) {
        System.out.println("===================存钱操作=====================");
        System.out.println("请您输入存款金额：");
        double money = sc.nextDouble();
        account.setMoney(account.getMoney()+money);
        System.out.println("存款成功，您的余额是："+account.getMoney());
    }

    private static void showAccount(Account account) {
        System.out.println("===================当前账户详情=====================");
        System.out.println("卡号"+account.getCardId());
        System.out.println("姓名"+account.getUserName());
        System.out.println("余额"+account.getMoney());
        System.out.println("当此限额"+account.getQuotomoney());
    }


    public static void register(ArrayList<Account> accounts, Scanner sc) {
        System.out.println("============用户开户功能============");
        System.out.println("请您输入开户名：");
        String name = sc.next();
        String password = "";
        while (true) {
            System.out.println("请您输入密码：");
            password = sc.next();
            System.out.println("请你再次输入密码：");
            String checkpassword = sc.next();
            if (!password.equals(checkpassword)) {
                System.out.println("密码不一样，请重新输入密码！");
            } else {

                break;
            }
        }
        System.out.println("请你输入档次限额：");
        double quotaMoney = sc.nextDouble();
        Account account = new Account();
        String cardId = createCardId(accounts);
        account.setCardId(cardId);
        account.setUserName(name);
        account.setPassWord(password);
        account.setQuotomoney(quotaMoney);
        accounts.add(account);
        System.out.println("恭喜您开户成功，您的卡号是："+account.getCardId()+"请您妥善保管！                                                                                                       ");
    }

    public static String createCardId(ArrayList<Account> accounts) {
        Random random = new Random();
        while (true) {
            String cardId = "";
            for (int i = 0; i < 8; i++) {
                cardId += random.nextInt(10);

            }
            Account accountByCardId = getAccountByCardId(cardId, accounts);
            if(accountByCardId==null){
                return cardId;
            }
        }
    }
    public static Account getAccountByCardId(String cardId,ArrayList<Account> accounts){
        for (Account acc : accounts) {
            if (acc.getCardId().equals(cardId))
                return acc;

        }
        return null;
    }
}
