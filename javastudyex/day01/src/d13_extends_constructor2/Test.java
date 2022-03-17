package d13_extends_constructor2;

public class Test {
    public static void main(String[] args) {
        Student student=new Student("zsh",20,"4");
        System.out.println(student.getAge());
        System.out.println(student.getName());
        System.out.println(student.getClassName());
    }
}
