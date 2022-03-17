package d1_file;

import java.io.File;
import java.util.Arrays;

/**

    目标：File针对目录的遍历
    - public String[] list()：
         获取当前目录下所有的"一级文件名称"到一个字符串数组中去返回。
    - public File[] listFiles()(常用)：
         获取当前目录下所有的"一级文件对象"到一个文件对象数组中去返回（重点）
 */
public class FileDemo04 {
    public static void main(String[] args) {
        // 1、定位一个目录
       File f1=new File("D:/resources");
        String[] names = f1.list();
        System.out.println(Arrays.toString(names));

        // 2.一级文件对象
        // 获取当前目录下所有的"一级文件对象"到一个文件对象数组中去返回（重点）
        File[] files = f1.listFiles();
        System.out.println(Arrays.toString(files));

        // 注意事项
        //当调用者不存在时 返回null
        File dir=new File("D:/adsfsdfas");
        File[] files1 = dir.listFiles();
        System.out.println(files1);

        //当调用者是个文件时返回null
        File dir2=new File("D:/resources/xiongmaoren.jpeg");
        File[] files2 = dir2.listFiles();
        System.out.println(files2);

        //空文件夹返回一个空数组
        File dir3=new File("D:/resources/ddd");
        File[] files3 = dir3.listFiles();
        System.out.println(files3);
        System.out.println(Arrays.toString(files3));

    }
}
