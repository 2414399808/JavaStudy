package methodCreate;

public class MethodDemo2 {
    public static void main(String[] args) {
        //目标 学习方法的完整定义格式，并理解其调用和执行流程
        int sum = sum(10, 22);
        System.out.println(sum);
    }
    public static int sum(int a,int b){
        int c=a+b;
        return c;
    }
}
