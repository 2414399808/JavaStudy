package javabean;

public class Test {
    public static void main(String[] args) {
        User u=new User();
        u.setUsername("张三");
        u.setHeight(185);
        u.setSalary(1000);
        System.out.println(u.getUsername()+" "+u.getHeight()+" "+u.getSalary());
        User u2=new User("李四",177,9000);
        System.out.println(u2.getUsername()+" "+u2.getHeight()+" "+u2.getSalary());
    }
}
