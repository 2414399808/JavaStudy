package d1_byte_buffer;

import java.io.*;

/**
 *   目标 使用字节缓冲流 完成数据的读写操作
 */
public class ByteBufferDemo {
    public static void main(String[] args) {
        try ( InputStream is=new FileInputStream("D:/resources/goutou.jpeg");
              //1把原始的字节输入流包装成高级的缓冲字节输入流
              InputStream bis=new BufferedInputStream(is);
              OutputStream os=new FileOutputStream("E:/movie/goutou.jpg");
              OutputStream bos=new BufferedOutputStream(os);

              ){
            int len;
            byte[] buffer=new byte[1024];
            while((len=bis.read(buffer))!=-1){
                bos.write(buffer,0,len);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
