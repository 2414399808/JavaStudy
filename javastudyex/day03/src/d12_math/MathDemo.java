package d12_math;

public class MathDemo {
    public static void main(String[] args) {
        //绝对值
        System.out.println(Math.abs(10));
        System.out.println(Math.abs(-10.3));
        //向上取整
        System.out.println(Math.ceil(4.0000000001));
        //向下取整
        System.out.println(Math.floor((4.99999999999)));
        //求指数次方
        System.out.println(Math.pow(2, 3));
        //四舍五入
        System.out.println(Math.round(4.4999999));
        System.out.println(Math.round(4.50000001));
        //随机数
        System.out.println(Math.floor(3+Math.random()*7));
    }
}
