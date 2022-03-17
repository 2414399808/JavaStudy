package d2_static_method;

public class Student {
    private String name;
    private int age;
    /*
    实例方法 无static修饰 属于对象的 通常表示对象自己的行为 可以访问对象的成员变量

     */
    public void study(){
        System.out.println(name+"在好好学习，天天向上");

    }
    /*
    静态方法 有static修饰 属于类 可以被类和对象共享访问
     */
    public static void getMax(int a,int b){
        System.out.println(a>b?a:b);
    }
    public static void main(String[] args) {
        //1 类名.静态方法
        Student.getMax(10,100);
        // 注意同一个类中访问静态成员 可以省略类名不写
        getMax(100,10);

        //2 对象.实例方法
//        study()//报错 非静态方法 即使是在类中也无法直接访问 也不能通过类名访问 必须要通过实例对象访问
        Student s1= new Student();
        s1.name="zsh";
        s1.study();

        // 对象.静态方法（不推荐）
        s1.getMax(10,100);
    }
}
