package operator;

public class OperatorDemo4 {
    public static void main(String[] args) {
        // 目标学会使用自增自减运算符 ++ --
        int a=10,b=10;
        a++;//a=a+1;
        System.out.println(a);
        b--;
        System.out.println(b);
        System.out.println("----------------------------------");
        //在表达式中或者不是单独操作的情况，++ --在变量前后存在区别
        //++ -- 在变量前面 先+1 -1 在使用
        //++ -- 在变量后面 先使用 在 +1 -1
        System.out.println(a++);
        System.out.println(++a);
        System.out.println("-----------拓展案例--------------");
        int k=3;
        int p=5;
        int rs =k++ + ++k - --p +p-- -k-- + ++p + 2;
        System.out.println(rs);

    }
}
