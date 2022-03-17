package d4_byte_stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

/**
 * 目标 使用文件字节输入流每次读取一个字节数组的数据
 */
public class FileInputStreamDemo02 {
    public static void main(String[] args) throws Exception {
        //1 创建一个文件字节输入流管道与源文件接通
        InputStream is=new FileInputStream("day09/src/data02.txt");
        //2 定义一个字节数组用来读取字节数组
        byte[] buffer=new byte[3];//读3个字节
//        int read = is.read(buffer);
//        System.out.println("读取几个字节："+read);
//        String s = new String(buffer);
//        System.out.println(s);
//        int read2 = is.read(buffer);
//        System.out.println("读取几个字节："+read2);
//        String s2 = new String(buffer);
//        System.out.println(s2);
//
//        int read3 = is.read(buffer);
//        System.out.println("读取几个字节："+read3);
//        //从第一个字节开始读 读read3长度个字节
//        String s3 = new String(buffer,0,read3);
//        System.out.println(s3);
//        //假设只有8字节 第二次读的数据是abc 剩下的数据是cd 会输出cdc 因为前一桶的c还留在桶中
//        //如果读不到数据了返回的桶的长度是-1 但是解码桶里的内容是上一桶的内容
//        int len = is.read(buffer);
//        System.out.println(len);
//        System.out.println(new String(buffer));
        int str;
        while((str=is.read(buffer))!=-1){
            System.out.println(new String(buffer, 0, str));
        }
    }
}
