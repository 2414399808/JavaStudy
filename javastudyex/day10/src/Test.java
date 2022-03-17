import java.io.*;

public class Test {
    public static void main(String[] args) {
        try(
                InputStream is=new FileInputStream("D:/resources/goutou.jpeg");
                OutputStream os=new FileOutputStream("day10/src/1.mp3");
                InputStream bis=new BufferedInputStream(is);
                OutputStream bos=new BufferedOutputStream(os);
                Reader fr=new FileReader("day10/src/data02.txt");
                Writer fw=new FileWriter("day10/src/1.mp3");
                BufferedReader br=new BufferedReader(fr);
                BufferedWriter bw=new BufferedWriter(fw);
                Reader fr1=new InputStreamReader(is);
                Writer fw1=new OutputStreamWriter(os);


        ) {

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
