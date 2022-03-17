package d8_extends_test;

public class Student extends Role{
    //都有属性
    private String className;

    //独有行为
    public void writeInfo(){
        System.out.println(getName()+"今天学习感觉很爽");
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }
}
