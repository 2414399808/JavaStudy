package d9_api_object;
/*
目标掌握Object类中的equals方法的使用
 */
public class Test2 {
    public static void main(String[] args) {
        Student s1=new Student("zsh",'男',20);
        Student s2=new Student("zsh",'男',20);
        //equals 默认比较两个对象的地址是否相同
        System.out.println(s1.equals(s2));
    }
}
