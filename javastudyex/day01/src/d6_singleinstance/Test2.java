package d6_singleinstance;

public class Test2 {
    public static void main(String[] args) {
        SingleInstance2 singleInstance2 = SingleInstance2.getInstance();
        SingleInstance2 singleInstance22 = SingleInstance2.getInstance();
        SingleInstance2 singleInstance23 = SingleInstance2.getInstance();
        System.out.println(singleInstance2+" "+singleInstance22+" "+singleInstance23);
    }
}
