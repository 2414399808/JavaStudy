package d5_serializable;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.ObjectInputStream;

/**
 * 目标 学会进行对象反序列化 使用对象字节输入流 把文件中的对象数据恢复成内存中的Java对象
 */
public class ObjectInputStreamDemo2 {
    public static void main(String[] args) throws Exception {
        ObjectInputStream ois=new ObjectInputStream(new FileInputStream("day10/src/obj.txt"));
        Object o = ois.readObject();
        if(o instanceof Student){
            Student s= (Student) o;
            System.out.println(s);
        }
    }
}
