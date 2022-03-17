package d5_integer;

public class Test {
    public static void main(String[] args) {
        int a=10;
        Integer a1=11;
        Integer a2=a;//自动装箱
        int a3=a1;//自动拆箱
        System.out.println(a);
        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);

        Integer age=null;
//        int age1=null;
//        int age2=age;//Integer类型的age的值为null自动装箱给age1不会报错 但是运行会报空指针异常
        System.out.println("--------------------");
        //包装类可以把基本类型的数据转换成字符串形式
        Integer i3=23;
        System.out.println(i3.toString()+1);

        //可以直接+”“得到字符串类型
        String rs2=i3+"";
        System.out.println(rs2);
        System.out.println("----------------------");
        //把字符串类型转换成它自己的类型int double
        String number="231";
        System.out.println(Integer.parseInt(number) * 2);
        System.out.println(Double.parseDouble(number) * 2);
        // xx.valueof和上面两个方法效果一致 建议使用 valueof方法
        System.out.println(Integer.valueOf(number) * 2);
        System.out.println(Double.valueOf(number) * 2);


        //上述方法都建立在你输入的字符串只有一种可以转化的格式的条件下 且一定要对应类型

        String rs3="12.3aa";
        //这种情况就会报NumberFormatException 错
//        System.out.println(Double.valueOf(rs3));



    }
}
