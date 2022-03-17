package d11_api_StringBuilder;
/*
目标 学会使用StringBuilder操作字符串 最终还需要知到它性能好的原因
 */
public class StringBuilderDemo1 {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("[");
        sb.append("a");
        sb.append("b");
        sb.append("1");
        sb.append("1.5");
        sb.append("sadfhjksdf");
        System.out.println(sb);
        //支持链式编程
        StringBuilder sb1=new StringBuilder();
        sb1.append("a").append("b").append("c");
        System.out.println(sb1);

        //反转
        System.out.println(sb1.reverse().append("ccc"));

        //长度
        System.out.println(sb1.length());

        //注意： StringBuilder只是凭借字符串的手段 效率好
        //最终的结果还是要恢复成String
        StringBuilder sb2=new StringBuilder();
        sb2.append("1234");
        String rs=sb2.toString();
        check(rs);
    }
    public static void check(String data){
        System.out.println(data);
    }
}
