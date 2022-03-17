package d5_resource;

import java.io.*;

public class TryCatchResourceDemo2 {
    public static void main(String[] args) {

        try (
                //只能放资源
                //这里面只能放置资源对象 用完会自动关闭 自动调用资源对象的close方法关闭资源 即使出现异常也会关闭
                InputStream is=new FileInputStream("D:\\resources\\xiongmaoren.jpeg");
            //2 创建一个字节输出流管道与目标文件接通
                OutputStream os=new FileOutputStream("E:\\movie\\new.jpg");

                //模拟链接资源
                MyConnection connection=new MyConnection();
                ){

            //1 创建一个字节输入流管道与原视频接通
            byte[] buffer=new byte[1024];//一般用1kb

            int len;
            while((len=is.read(buffer))!=-1){
                os.write(buffer,0,len);

            }
            System.out.println("完成");
//            System.out.println(10/0);
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
class MyConnection implements AutoCloseable{

    @Override
    public void close() throws IOException {
        System.out.println("资源被成功释放");
    }
}
