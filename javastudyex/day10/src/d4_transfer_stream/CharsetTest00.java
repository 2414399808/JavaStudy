package d4_transfer_stream;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

/**
 * 演示一下代码编码与文件编码相同喝不同的情况
 */
public class CharsetTest00 {
    public static void main(String[] args) {

        try ( //代码 UTF-8 文件 UTF-8 不会乱码
//                Reader fr=new FileReader("day10/src/data02.txt");
              Reader fr=new FileReader("D:\\resources\\data1.txt");
             //代码 UTF-8 文件 GBK 会乱码
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
