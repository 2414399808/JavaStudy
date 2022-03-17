package d3_char_buffer;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
/*
目标 完成出师表顺序
 */
public class Test3 {
    public static void main(String[] args) {
        try (
             BufferedReader br=new BufferedReader(new FileReader("day10/src/csb.txt"));
             BufferedWriter bw=new BufferedWriter(new FileWriter("day10/src/csb2.txt"));


        ){
            String line;
            List<String> csb=new ArrayList<>();
            while((line=br.readLine())!=null){
                csb.add(line);
            }
           List<String> size=new ArrayList<>();
            Collections.addAll(size,"一","二","三","四","五","陆","柒","八","九","十","十一");
            Collections.sort(csb, new Comparator<String>() {
                @Override
                public int compare(String o1, String o2) {
                    return size.indexOf(o1.substring(0,o1.indexOf(".")))-size.indexOf(o2.substring(0,o2.indexOf(".")));
                }
            });
            for (String s : csb) {
                bw.write(s);
                bw.newLine();

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
