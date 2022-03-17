package d10_extends_field_method;

public class ExtendsDemo2 {
    public static void main(String[] args) {
        Student student=new Student();
        student.run();
        student.go();
    }
}
class Student extends People{
    public void run(){
        System.out.println("学生跑得快~~~");
    }
    public void go(){
        run();
        super.run();
    }
}
class People{
    public void run(){
        System.out.println("可以跑~~~~");
    }
}
