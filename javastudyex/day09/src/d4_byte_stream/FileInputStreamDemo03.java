package d4_byte_stream;

import java.io.*;

/**
 * 目标 使用文件字节输入流 一次读完全部字节 可以解决乱码问题
 */
public class FileInputStreamDemo03 {
    public static void main(String[] args) throws Exception {
        //1 创建一个文件字节输入流管道与源文件接通
        InputStream is=new FileInputStream("day09/src/data02.txt");
//        //2定义一个字节数组与文件的大小一样大
//        File file=new File("day09/src/data02.txt");
//        long length = file.length();
//        byte[] buffer=new byte[(int)length];
//        int read = is.read(buffer);
//        System.out.println("读取了几个字节："+read);
//        System.out.println(new String(buffer,0, read));

        byte[] bytes = is.readAllBytes();
        System.out.println(new String(bytes));

    }
}
