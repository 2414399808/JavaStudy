package d7_innerclass;
/*
目标 了解局部内部类的语法
 */
public class Test {
    public static void main(String[] args) {
        class A{
            private String name;
            public static int onLineNumber=100;

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public static int getOnLineNumber() {
                return onLineNumber;
            }

            public static void setOnLineNumber(int onLineNumber) {
                A.onLineNumber = onLineNumber;
            }
        }
        A a=new A();
        a.setName("zsh");
        System.out.println(a.getName());
    }
}
