package d8_innerclass_anonymous;

/**
 * 掌握匿名内部类的使用形式
 */
public class Test2 {
    public static void main(String[] args) {
       Swimming s1=new Swimming() {
           @Override
           public void swim() {
               System.out.println("学生游泳");
           }
       };
        go(s1);
        go(new Swimming() {
            @Override
            public void swim() {
                System.out.println("老师游泳");
            }
        });
    }
    public static void go(Swimming s){

        System.out.println("开始");
        s.swim();
        System.out.println("结束");
    }
}
