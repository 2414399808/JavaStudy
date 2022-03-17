package d2_recusion;

import java.io.File;

public class searchFileTest {
    public static void main(String[] args) {
        File f=new File("D:/");
        searchFile(f,"linguist.exe");
    }

    private static void searchFile(File f, String s) {

      if(f!=null&&f.isDirectory()){
          File[] files = f.listFiles();
          if(files!=null&&files.length>0){
              for (File file : files) {
                  if(file.isFile()){
                      if(file.getName().contains(s))
                          System.out.println(file.getAbsolutePath());
                  }else{
                      searchFile(file,s);
                  }

              }
          }
      }else{
          System.out.println("你这不是目录");
      }
    }
}
