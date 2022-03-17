package d6_innerclass;

    /*
    外部类
     */
public class Outer {
        /**
         * 成员内部类 不能加static修饰
         */
        class Inner{
            private String name;
            private int age;
            public static int a;
            public static void test(){

            }
            public void show(){

            }
            public static void call(){
                System.out.println("call");
            }
            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public int getAge() {
                return age;
            }

            public void setAge(int age) {
                this.age = age;
            }
        }
    }
