package operator;

public class OperatorDemo5 {
    public static void main(String[] args) {
        //目标 学会使用赋值运算符 = += -= *= /= %=
        //赋值运算符会优先把运算结果转成前面的值即a+=b  ==  a=(int)a+b
        int a=10;
        int b=200;
        //a=a+b;
        a+=b;
        System.out.println(a);
        a-=b;
        System.out.println(a);
        a*=b;
        System.out.println(a);
        a/=b;
        System.out.println(a);
        b%=a;
        System.out.println(b);
    }
}
