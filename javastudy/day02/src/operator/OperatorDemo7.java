package operator;

public class OperatorDemo7 {
    public static void main(String[] args) {
        //目标 学会使用逻辑运算符 并能够选择合适的逻辑运算符解决问题
        //&& 与&的区别 &&检测到左边的为false时右边就不在运行了
        double size=9.8;
        double storage=6;
        //需求 尺寸大于等于6。95 内存要大于等于8GB
        System.out.println(size >=6.95 &&storage>=8);
        System.out.println(size >=6.95 ||storage>=8);
        System.out.println(!true);

    }
}
