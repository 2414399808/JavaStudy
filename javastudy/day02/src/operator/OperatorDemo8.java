package operator;

public class OperatorDemo8 {
    public static void main(String[] args) {
        //目标实现三元运算符 理解其流程
        double score =98;
        System.out.println(score>=60 ?"考试通过":"挂科");


        int i=10;
        int j=90;
        int k=50;
        System.out.println((i>j?i:j)>k?(i>j?i:j):k);
    }
}
