package d7_Arrays;

import java.util.Arrays;
import java.util.Comparator;

public class ArraysDemo2 {
    public static void main(String[] args) {
        //目标 自定义数组的排序规则 Comparator比较器对象。
        //1Arrays的sort方法对于默认有值特性的数组是升序排序
        int[] age={34,12,23,42};
        Arrays.sort(age);
        System.out.println(Arrays.toString(age));
        //2 需求 降序排序 (自定义比较器对象 只能支持引用类型的排序)
        Integer[] ages1={34,12,42,23};
        /**
         * 参数一 被排序的数组 必须是引用数据类型的元素
         * 参数二 匿名内部类对象 代表了一个比较器对象
         */
        Arrays.sort(ages1, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                //制定比较规则
//                if(o1>o2)
//                return 1;
//                else if(o1<o2)
//                    return -1;
//
//                return 0;
               // return o1-o2;//默认升序
                return o2-o1;//降序
            }

        });
        System.out.println(Arrays.toString(ages1));
        System.out.println("-----------------------------");
        Student[] students=new Student[3];
        students[0]=new Student("zsh",20,180.5);
        students[1]=new Student("lwl",21,180.0);
        students[2]=new Student("pwx",22,170);
        //Arrays.sort(students);//不能直接用sort排序 会报错
        Arrays.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                //自己指定比较规则
//                return o1.getAge()-o2.getAge();

//                //注意不能用double比较 因为返回值得是int类型 会出现误差 但是java 提供了别的api
            return Double.compare(o1.getHeight(),o2.getHeight());
            }
        });
        System.out.println(Arrays.toString(students));
    }
}
