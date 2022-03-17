package d7_extends;

public class Test {
    public static void main(String[] args) {
        Student student = new Student();
        student.setAge(15);
        student.setName("zsh");
        System.out.println(student.getAge());
        System.out.println(student.getName());
        student.study();
    }
}
