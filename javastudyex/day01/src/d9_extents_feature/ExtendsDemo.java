package d9_extents_feature;



public class ExtendsDemo {
    public static void main(String[] args) {
        //子类是否可以继承私有的属性和行为呢 我认为可以 （继承了但不能直接使用 要通过其他方法使用）
        Student student=new Student();
        System.out.println(student.getAge());
        student.run();
        //子类是否可以继承静态的属性和行为呢 我认为不可以（ 可以使用 但是没有继承 因为 静态方法只在类创建的时候创建一次 只属于那个创建的类）
        System.out.println(Student.onLineNumber);
        Student.inAddr();
    }
}
class Student extends People{

}
class People{
    public static int onLineNumber=161;
    private int age=21;
    public void run(){
        System.out.println("人跑得很快");
    }
    public static void inAddr(){
        System.out.println("我们在黑马中心");
    }
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
class A{

}
class B{

}
class C extends B {

}