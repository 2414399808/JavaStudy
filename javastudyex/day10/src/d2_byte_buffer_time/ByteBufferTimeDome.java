package d2_byte_buffer_time;

import java.io.*;

/**
 目标：利用字节流的复制统计各种写法形式下缓冲流的性能执行情况。

 复制流：
 （1）使用低级的字节流按照一个一个字节的形式复制文件。
 （2）使用低级的字节流按照一个一个字节数组的形式复制文件。
 （3）使用高级的缓冲字节流按照一个一个字节的形式复制文件。
 （4）使用高级的缓冲字节流按照一个一个字节数组的形式复制文件。

 源文件：C:\course\3-视频\18、IO流-文件字节输出流FileOutputStream写字节数据出去.avi
 目标文件：C:\course\

 小结：
 使用高级的缓冲字节流按照一个一个字节数组的形式复制文件，性能好，建议开发使用！
 */
public class ByteBufferTimeDome {
    private static final String SRC_FILE="D:\\BaiduNetdiskDownload\\钢之炼金术师FA\\01.rmvb";
    private static final String DEST_FILE="E:\\movie\\";

    public static void main(String[] args) {
//         copy01(); // 使用低级的字节流按照一个一个字节的形式复制文件：慢的让人简直无法忍受。直接被淘汰。
        copy02(); // 使用低级的字节流按照一个一个字节数组的形式复制文件: 比较慢，但是还是可以忍受的！
         copy03(); // 缓冲流一个一个字节复制：很慢，不建议使用。
        copy04(); // 缓冲流一个一个字节数组复制：飞快，简直太完美了（推荐使用）
    }

    private static void copy04() {
        long startTime=System.currentTimeMillis();
        try ( InputStream is=new FileInputStream(SRC_FILE);
              InputStream bis=new BufferedInputStream(is);
              OutputStream os=new FileOutputStream(DEST_FILE+"4.mp4");
              OutputStream bos=new BufferedOutputStream(os);){

            byte[] buffer=new byte[1024*8];
            int len;
            while((len=bis.read(buffer))!=-1){
                bos.write(buffer,0,len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        long endTime=System.currentTimeMillis();
        System.out.println("使用高级的缓冲字节流按照一个一个字节数组形式复制文件"+(endTime-startTime)/1000.0);
    }

    private static void copy03() {
        long startTime=System.currentTimeMillis();
        try ( InputStream is=new FileInputStream(SRC_FILE);
              InputStream bis=new BufferedInputStream(is);
              OutputStream os=new FileOutputStream(DEST_FILE+"3.mp4");
              OutputStream bos=new BufferedOutputStream(os);){

            int i;
            while((i=bis.read())!=-1){
                bos.write(i);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        long endTime=System.currentTimeMillis();
        System.out.println("使用高级的缓冲字节流按照一个一个字节形式复制文件"+(endTime-startTime)/1000.0);
    }

    private static void copy02() {
        long startTime=System.currentTimeMillis();
        try (InputStream is=new FileInputStream(SRC_FILE);
             OutputStream os=new FileOutputStream(DEST_FILE+"2.mp4");){

            byte[] buffer=new byte[1024*8];
            int len;
            while((len=is.read(buffer))!=-1){
                os.write(buffer,0,len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        long endTime=System.currentTimeMillis();
        System.out.println("使用低级的字节流按照一个一个字节数组形式复制文件"+(endTime-startTime)/1000.0);
    }



    private static void copy01() {
        long startTime=System.currentTimeMillis();
        try (InputStream is=new FileInputStream(SRC_FILE);
             OutputStream os=new FileOutputStream(DEST_FILE+"1.mp4");){

            int i;
            while((i=is.read())!=-1){
                os.write(i);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        long endTime=System.currentTimeMillis();
        System.out.println("使用低级的字节流按照一个一个字节形式复制文件"+(endTime-startTime)/1000.0);
    }

}
