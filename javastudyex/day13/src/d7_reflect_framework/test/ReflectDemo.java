package d7_reflect_framework.test;

public class ReflectDemo {
    public static void main(String[] args) throws Exception {
        Student s=new Student("zsh",'男',20,"软件四班","打代码");
        MybatisUtil.save(s);
    }
}
