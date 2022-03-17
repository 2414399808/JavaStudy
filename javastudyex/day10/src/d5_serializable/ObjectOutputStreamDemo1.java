package d5_serializable;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

/**
 *  目标 学会对象序列化 使用 ObjectOutputStream 把内存中的对象存入到磁盘文件中
 *
 *  transient 修饰的成员变量不参与序列化
 *  对象如果要序列化 必须实现Serializable接口
 *  申明序列化的版本号
 *  序列化的版本号与反序列化的版本号必须一致才不会出错
 *  private static final long serialVersionUID=1;
 */
public class ObjectOutputStreamDemo1 {
    public static void main(String[] args) throws Exception {
        Student s1=new Student("周思航","zsh","123",20);
        //2 对象序列化 使用对象字节输出流包装字节输出流管道
        ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("day10/src/obj.txt"));
        //3 直接调用序列化方法
        oos.writeObject(s1);

        oos.close();
    }
}
