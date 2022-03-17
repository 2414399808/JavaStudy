package type;

public class TypeDemo3 {
    public static void main(String[] args) {
        //目标 理解强制类型转换 并使用
        int a=20;
        byte b=(byte)a;
        System.out.println(a);
        System.out.println(b);

        int i=1500;
        byte j= (byte) i;
        System.out.println(j);

        double s=99.7;
        int t= (int) s;
        System.out.println(t);
    }
}
