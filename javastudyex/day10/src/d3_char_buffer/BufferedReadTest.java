package d3_char_buffer;

import java.io.*;

public class BufferedReadTest {
    public static void main(String[] args) {
        try (
                Reader fr=new FileReader("day10/src/data02.txt");
                BufferedReader br=new BufferedReader(fr);

                ){
            String line;
            while((line=br.readLine())!=null){
                System.out.println(line);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
