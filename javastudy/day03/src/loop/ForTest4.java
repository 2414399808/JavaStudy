package loop;

public class ForTest4 {
    public static void main(String[] args) {
        //水仙花数
        for (int i = 100; i <=999 ; i++) {
            int a=i%10;
            int b=i/100;
            int c=i/10%10;
            if(a*a*a+b*b*b+c*c*c==i){
                System.out.println(i);
            }
        }
    }
}
