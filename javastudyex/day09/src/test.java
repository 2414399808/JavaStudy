import java.io.*;

public class test {
    public static void main(String[] args)  {
        try (InputStream is=new FileInputStream("day09/src/data02.txt");
             OutputStream os=new FileOutputStream("day09/src/out05.txt",true);
             Reader fr=new FileReader("day09/src/data02.txt");
             Writer fw=new FileWriter("day09/src/out06.txt");
        ){
            fw.write('t');
            fw.write('t');
            fw.write('徐');
            char[] buffer={'c','里'};
            fw.write(buffer);
            fw.write("\r\n");
            fw.write("我是中国人");
            fw.flush();
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }



    }
}
