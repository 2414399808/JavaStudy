package d1_file;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
     目标：File类的获取功能的API
     - public String getAbsolutePath()  ：返回此File的绝对路径名字符串。
     - public String getPath()  ： 获取创建文件对象的时候用的路径
     - public String getName()  ： 返回由此File表示的文件或目录的名称。
     - public long length()  ：    返回由此File表示的文件的长度。
 */
public class FileDemo02 {
    public static void main(String[] args) {
        // 1.绝对路径创建一个文件对象
        File f1=new File("D:/goutou.jpeg");
        System.out.println(f1.exists());
        // a.获取它的绝对路径。
        System.out.println(f1.getAbsolutePath());
        // b.获取文件定义的时候使用的路径。
        System.out.println(f1.getPath());
        // c.获取文件的名称：带后缀。
        System.out.println(f1.getName());
        // d.获取文件的大小：字节个数。
        System.out.println(f1.length());//字节大小
        // e.获取文件的最后修改时间
        long l = f1.lastModified();
        System.out.println(f1.lastModified());//时间毫秒值
        Date date = new Date(l);
        System.out.println(date);
        System.out.println("最后修改时间"+new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").format(l));
        // f、判断文件是文件还是文件夹
        System.out.println(f1.isFile());//如果是文件就是true
        System.out.println(f1.isDirectory());//文件夹

        System.out.println("-------------------------");
// 1.绝对路径创建一个文件对象
        File f2=new File("day09\\src\\data.txt");
        System.out.println(f2.exists());
        // a.获取它的绝对路径。
        System.out.println(f2.getAbsolutePath());
        // b.获取文件定义的时候使用的路径。
        System.out.println(f2.getPath());
        // c.获取文件的名称：带后缀。
        System.out.println(f2.getName());
        // d.获取文件的大小：字节个数。
        System.out.println(f2.length());//字节大小
        // e.获取文件的最后修改时间
        long l2 = f2.lastModified();
        System.out.println(f2.lastModified());//时间毫秒值
        Date date2 = new Date(l);
        System.out.println(date2);
        System.out.println("最后修改时间"+new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").format(l2));
        // f、判断文件是文件还是文件夹
        System.out.println(f2.isFile());//如果是文件就是true
        System.out.println(f2.isDirectory());//文件夹


        File f3=new File("D:/");
        System.out.println(f3.isFile());
        System.out.println(f3.isDirectory());
    }
}
