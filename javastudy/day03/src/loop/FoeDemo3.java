package loop;

public class FoeDemo3 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 1) {
                sum += i;
            }
        }
        System.out.println(sum);
        System.out.println("----------------------------");
        for (int i = 1; i <= 10; i+=2) {
            sum += i;
        }
        System.out.println(sum);
    }
}
