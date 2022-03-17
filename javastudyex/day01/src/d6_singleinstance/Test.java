package d6_singleinstance;

public class Test {
    public static void main(String[] args) {
        SingleInstance1 singleInstance1 = SingleInstance1.singleInstance1;
        SingleInstance1 singleInstance2 = SingleInstance1.singleInstance1;
        SingleInstance1 singleInstance3 = SingleInstance1.singleInstance1;
        System.out.println(singleInstance1+" "+singleInstance2+" "+singleInstance3);
    }
}
