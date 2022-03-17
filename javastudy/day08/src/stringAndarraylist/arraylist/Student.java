package stringAndarraylist.arraylist;

public class Student {
    private String studtId;
    private String name;
    private int age;
    private String className;

    public Student(String studtId, String name, int age, String className) {
        this.studtId = studtId;
        this.name = name;
        this.age = age;
        this.className = className;
    }

    public Student() {
    }

    @Override
    public String toString() {
        return "Student{" +
                "studtId='" + studtId + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", className='" + className + '\'' +
                '}';
    }

    public String getStudtId() {
        return studtId;
    }

    public void setStudtId(String studtId) {
        this.studtId = studtId;
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

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }
}
