package returndemo;

public class ReturnDemo1 {
    public static void main(String[] args) {
        //目标 明确return关键字的作用
        chu(2,1);
    }
    public static void chu(int a,int b){
        if(b==0){
            System.out.println("除数为零");
            return;
        }

            System.out.println(a/b);

    }
}
