package d9_abstract_template.after;

public class Test {
    public static void main(String[] args) {
        CurrentAccount currentAccount=new CurrentAccount("ICBC_111",1000000);
        currentAccount.handle("itheima","123456");
    }
}
