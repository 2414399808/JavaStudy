package d2_recusion;

public class RecusionDemo03 {
    public static void main(String[] args) {
        System.out.println(peach(10));
    }
    public static int peach(int n){
        if (n == 1) {
            return 1;
        }
        else
            return (peach(n-1)+1)*2;
    }
}
