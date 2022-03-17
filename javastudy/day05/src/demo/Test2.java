package demo;

public class Test2 {
    public static void main(String[] args) {

        judge(8);
    }
    public static void judge(int n){
        if(n%2==0){
            System.out.println(n+"是偶数");
        }
        else{
            System.out.println(n+"是奇数");
        }
    }
}
