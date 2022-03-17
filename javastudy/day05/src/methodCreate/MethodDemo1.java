package methodCreate;

public class MethodDemo1 {
    public static void main(String[] args) {
        // 张工
        int c1=sum(10,30);
        System.out.println(c1);
        //徐工
        int c2=sum(30,30);
        System.out.println(c2);
    }
    public static int sum(int a,int b){
        int c=a+b;
        return c;
    }
}
