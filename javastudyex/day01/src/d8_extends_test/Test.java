package d8_extends_test;

public class Test {
    public static void main(String[] args) {
        Student student=new Student();
        student.setName("zsh");
        student.setAge(16);
        student.setClassName("4");
        System.out.println(student.getName()+" "+student.getAge()+" "+student.getClassName());
        student.queryCourse();
        student.writeInfo();

    }
}
