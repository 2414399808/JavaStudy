package d1_file;

import java.io.File;

/**
 * 目标 学会创建File对象定位操作系统的文件（文件 文件夹）
 * File类 创建对象定位文件 可以删除 获取文件信息等 但是不能读写文件内容
 */
public class FileDemo {
    public static void main(String[] args) {
        //创建File对象
        //路径写法 D:\goutou.jpeg
        //路径写法 D:/goutou.jpeg
        //File.separator
//        File f1=new File("D:\\goutou.jpeg");
//        File f2=new File("D:/goutou.jpeg");
//        File f3=new File("D:"+File.separator+"goutou.jpeg");
//        long length = f1.length();//拿到的是文件的字节个数
//        System.out.println(length);
//        System.out.println(f2.length());
//        System.out.println(f3.length());



        //2File创建对象 支持绝对路径 也支持相对路径（重点）
        File f1=new File("D:\\goutou.jpeg");//绝对路径
        System.out.println(f1.length());

        //相对路径 一般定位模块中的文件的
        //相对是相对到你的项目路径的也就是从模块开始写 xxxx/src/xxxx(文件名)
        File f2=new File("day09/src/data.txt");
        System.out.println(f2.length());

        //3 File创建 对象 可以是文件也可以是文件夹
        File f3=new File("D:/dd");
        //这里指的不是文件夹中所有文件大小的总和 而是文件夹本身的大小
        System.out.println(f3.length());
        //判断这个路径存不存在
        System.out.println(f3.exists());

    }
}
