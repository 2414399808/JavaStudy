package stringAndarraylist.arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListTest6 {
    public static void main(String[] args) {
        ArrayList<Student> students=new ArrayList<>();
        students.add(new Student("01","zsh",20,"一班"));
        students.add(new Student("02","lyx",20,"一班"));
        students.add(new Student("03","zyq",20,"二班"));
        students.add(new Student("04","lwl",20,"二班"));
        System.out.println("学号  姓名  年龄  班级");
        for (int i = 0; i < students.size(); i++) {
            System.out.println(students.get(i));

        }
        Scanner sc=new Scanner(System.in);
        System.out.println("请您输入要查询的学生的id");
        String id=sc.next();
        Student studentByStudyId = getStudentByStudyId(students, id);
        if(studentByStudyId==null){
            System.out.println("查无此人");
        }
        else{
            System.out.println(studentByStudyId);
        }
    }
    public static Student getStudentByStudyId(ArrayList<Student> students,String id){
        for (int i = 0; i < students.size(); i++) {
            Student student = students.get(i);
            if(student.getStudtId().equals(id)){
                return student;
            }

        }
        return null;
    }
}
