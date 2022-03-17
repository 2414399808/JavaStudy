package loop;

public class WhileTest6 {
    public static void main(String[] args) {
        double peakHeight=8848860;
        double i=0.1;
        int count=0;
        while(i<peakHeight){
            i*=2;
            count++;
        }
        System.out.println(count);
    }
}
