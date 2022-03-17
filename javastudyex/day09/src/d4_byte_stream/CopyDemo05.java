package d4_byte_stream;

import java.io.*;

/**
 * 目标 学会使用字节流完成文件的复制（支持一切文件
 */
public class CopyDemo05 {
    public static void main(String[] args) {
        try {
        //1 创建一个字节输入流管道与原视频接通
            InputStream is=new FileInputStream("D:\\resources\\xiongmaoren.jpeg");
            //2 创建一个字节输出流管道与目标文件接通
            OutputStream os=new FileOutputStream("E:\\movie\\new.jpg");
            byte[] buffer=new byte[1024];//一般用1kb

            int len;
            while((len=is.read(buffer))!=-1){
                os.write(buffer,0,len);

            }
            System.out.println("完成");
            os.close();
            is.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
