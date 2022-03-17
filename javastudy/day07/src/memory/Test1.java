package memory;

public class Test1 {
    public static void main(String[] args) {
        //目标 理解两个变量指向同一个对象
        Student s1=new Student();
        Student s2=s1;
        s1.name="小明";
        s1.sex='男';
        s1.hobby="睡觉，游戏，上课";
        s2.study();

    }
}
