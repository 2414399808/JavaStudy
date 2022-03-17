package type;

public class TypeDemo2 {
    public static void main(String[] args) {
        //目标 掌握表达式的自动类型转化的规则
        byte a=10;
        int b=20;
        double c=1.0;
        System.out.println(a+b+c);
        byte i=10;
        byte j=20;
       // byte k=i+j; 会报错 因为i+j会先把i和j转化成int类型 然后在加在一起，
        // 得到的结果是int类型 不可以用byte类型接收 这里也有考虑到越界问题，两个byte加起来的值可能超过byte
        int l=i+j;
        System.out.println(l);
    }
}
