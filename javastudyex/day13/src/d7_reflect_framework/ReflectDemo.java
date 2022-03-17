package d7_reflect_framework;

/**
 * 目标 提供一个通用框架 支持保存所有对象的具体信息
 */
public class ReflectDemo {
    public static void main(String[] args) throws Exception {
        Student s=new Student("zsh",'男',20,"软件四班","打代码");
        MybatisUtil.save(s);
        Teacher t=new Teacher("lwl",'男',100000);
        MybatisUtil.save(t);
    }
}
