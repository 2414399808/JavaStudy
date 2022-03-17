package d3_char_buffer;

import java.io.*;

/*
目标 学会使用缓冲字符输入流提高字符输入流的性能 新增了按照行读取的方法(经典代码)
 */
public class BufferedReadDemo1 {
    public static void main(String[] args) {
        try (Reader fr=new FileReader("day10/src/data02.txt");
            BufferedReader br=new BufferedReader(fr);


        ){

//            char[] buffer=new char[1024];
//            int len;
//            while((len=fr.read(buffer))!=-1){
//                String s = new String(buffer, 0, len);
//                System.out.println(s);
//            }
//            System.out.println(br.readLine());
//            System.out.println(br.readLine());
//            System.out.println(br.readLine());
//            System.out.println(br.readLine());
//            System.out.println(br.readLine());
//            System.out.println(br.readLine());
            String line;
            while((line=br.readLine())!=null){
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
