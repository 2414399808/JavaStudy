package d3_final;

public class Test2 {
    public static void main(String[] args) {
        //final 修饰变量的注意事项
        //1 final 修饰基本类型变量 其数据不能再改变
       final double rate=3.1415;
       //rate=1111;//第二次赋值 报错
        //*String 是引用数据类型 但是java做了特殊处理使得String和基础数据类型相同 所以这里final修饰的String变量 不可以第二次赋值
        //2 final 修饰引用数据类型 变量中存储的地址不能改变 但是地址指向的对象内容可以改变

        final int[] arr={111,222,333,444};

        arr[2]=444;

    }
}
