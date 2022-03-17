package test;

public class Test {
    public static void main(String[] args) throws Exception {
        Class c = Class.forName("test.Student");
        Class c1= Student.class;
        Student s=new Student();
        Class c2= s.getClass();
        System.out.println(c);
        System.out.println(c1);
        System.out.println(c2);
    }
}
