package d10_api_objects;

import java.util.Objects;

/*
目标 掌握objects类的常用方法equals
 */
public class Test {
    public static void main(String[] args) {
        String s1=null;
        String s3="zsh";
        String s2=new String("zsh");
//        System.out.println(s1.equals(s2));
// object提供的equals方法 在提供的一方String对象为空时 会出现空指针异常
// 但是Objects提供的equals方法就不会有这种问题 他会先排除String对象为空这种情况(更安全 结果更准确)
        System.out.println(Objects.equals(s1, s3));
/*
    public static boolean equals(Object a, Object b) {
        return (a == b) || (a != null && a.equals(b));
    }

 */
        System.out.println(Objects.isNull(s1));
    }
}
