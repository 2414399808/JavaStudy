package d4_byte_stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class FileInputStreamDemo01 {
    public static void main(String[] args) throws IOException {
        //1 创建一个文件字节输入流管道余源文件接通
        InputStream is=new FileInputStream("day09/src/data.txt");
        //2 读取一个字节返回 每次读取一滴水
//        int b=is.read();
//        System.out.println((char)b);
//        int b2=is.read();
//        System.out.println((char)b2);
//        int b3=is.read();
//        System.out.println((char)b3);
//        int b4=is.read();
//        System.out.println(b4);//读取完返回-1


        //3 使用循环改进
        int b;
        while((b=is.read())!=-1){
            System.out.println((char) b);
        }

    }
}
