package d5_innerclass_static;

/**
 * 外部类
 */
public class Outer {
    public static int a=100;
    /*
    学习静态成员内部类
     */
    public static class Inner{
        private String name;
        private int age;
        private String schoolName;

        public Inner() {
        }

        public Inner(String name, int age, String schoolName) {
            this.name = name;
            this.age = age;
            this.schoolName = schoolName;
        }
        public void show(){
            System.out.println(a);
        }
        public static void pp(){

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

        public String getSchoolName() {
            return schoolName;
        }

        public void setSchoolName(String schoolName) {
            this.schoolName = schoolName;
        }
    }
}
