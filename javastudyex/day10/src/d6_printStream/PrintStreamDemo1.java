package d6_printStream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

/**
 * 学会打印流 特点 高效 方便写数据到文件中
 */
public class PrintStreamDemo1 {
    public static void main(String[] args) throws Exception {
        // 1创建一个打印流对象
        PrintStream ps=new PrintStream(new FileOutputStream("day10/src/ps.txt"));
        PrintStream ps2=new PrintStream("day10/src/ps.txt","GBK");
        ps2.println(97);
        ps2.println('a');
        ps2.println(12.1);
        ps2.println(true);

        ps2.close();
    }
}
