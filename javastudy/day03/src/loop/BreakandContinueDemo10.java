package loop;

public class BreakandContinueDemo10 {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            System.out.println("洗碗");
            if(i==2){
                break;
            }
        }
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
            if(i==3)
                continue;
                System.out.println("啦啦啦");
        }
    }
}
