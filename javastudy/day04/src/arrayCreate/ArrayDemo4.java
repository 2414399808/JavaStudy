package arrayCreate;

public class ArrayDemo4 {
    public static void main(String[] args) {
        //动态初始化数组的定义和使用

        double[] scores=new double[3];
        scores[0]=99;
        scores[1]=22;
        scores[2]=88;
        for (int i = 0; i < 3; i++) {
            System.out.println(scores[i]);
        }
    }
}
