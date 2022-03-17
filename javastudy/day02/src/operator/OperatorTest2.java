package operator;

public class OperatorTest2 {
    public static void main(String[] args) {
        int a = 123;
        System.out.println("整数123的个位为" + a % 10);
        System.out.println("整数123的十位为" + a / 10 % 10);
        System.out.println("整数123的百位为" + a / 100);
    }
}
