package d5_resource;

import java.io.*;

/**
 * 目标 学会使用finally释放资源
 */
public class TryCatchFinallyDemo1 {
    public static void main(String[] args) {
        InputStream is=null;
        OutputStream os=null;
        try {

        //1 创建一个字节输入流管道与原视频接通
             is=new FileInputStream("D:\\resources\\xiongmaoren.jpeg");
            //2 创建一个字节输出流管道与目标文件接通
             os=new FileOutputStream("E:\\movie\\new.jpg");
            byte[] buffer=new byte[1024];//一般用1kb

            int len;
            while((len=is.read(buffer))!=-1){
                os.write(buffer,0,len);

            }
            System.out.println("完成");
//            System.out.println(10/0);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //无论代码是正常结束还是出现异常都要最后执行这里
            System.out.println("============finally=============");
            try {
                if(os!=null)
                os.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
               if(is!=null)
                is.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }
    public static int test(int a,int b){
        try{
            int c=a/b;
            return c;
        } catch (Exception e) {
            e.printStackTrace();
            return -1;
        }finally {
            return 100;//必定执行
        }
    }
}
