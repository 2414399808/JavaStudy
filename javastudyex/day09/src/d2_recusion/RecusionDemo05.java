package d2_recusion;

import java.io.File;
import java.io.IOException;

/*
目标 去D盘 判断搜索 linguist.exe文件
 */
public class RecusionDemo05 {
    public static void main(String[] args) {
        //1 传入目录和文件名
        File f=new File("D:/");
        searchFile(f,"linguist.exe");
    }

    /**
     * 搜索某个目录下的全部文件 找到我们想要的文件
     * @param dir 被搜索的原目录
     * @param filename 被搜索的文件名称
     */
    public static void searchFile(File dir,String filename){
       //判断 dir是否为目录
        if(dir!=null&&dir.isDirectory()){
            //提取当前目录下的一级文件对象
            File[] files = dir.listFiles();
            // 判断是否存在一级文件对象 存在才可以遍历
            if(files!=null&&files.length>0){
                for (File file : files) {
                    //判断当前遍历的一级文件对象是文件还是目录
                    if (file.isFile()) {
                        if(file.getName().contains(filename)){
                            System.out.println(file.getAbsolutePath());
                            //启动它
                            Runtime r=Runtime.getRuntime();
                            try {
                                r.exec(file.getAbsolutePath());
                            } catch (IOException e) {
                                e.printStackTrace();
                            }
                        }
                    }
                    else
                    {
                        searchFile(file,filename);
                    }

                }
            }
        }
        else{
            System.out.println("对不起，您当前搜索的位置不是文件夹");
        }
    }
}
