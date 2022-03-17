package d9_lambda;

public class LambadDemo2 {
    public static void main(String[] args) {
        //目标 学会使用Lambda的标准格式简化匿名内部类的代码形式
        //Lambda只能简化接口中只有一个抽象方法的匿名内部类
        new Swimming() {
            @Override
            public void swim() {
                System.out.println("老师游得很快");
            }
        }.swim();
        Swimming s2=()-> {
            System.out.println("老师游得很快");
        };
        s2.swim();
        System.out.println("---------------------------------");

        go(()->{
            System.out.println("学生游得也很快");
        });
    }
    public static void go(Swimming s){
        s.swim();
    }
}
@FunctionalInterface//一旦加上这个注解 必须是函数式接口，里面只能有一个抽象方法 这是开启简化的标志
interface Swimming{
    void swim();
}
