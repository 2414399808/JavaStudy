package d6_printStream;

import java.io.FileOutputStream;
import java.io.PrintStream;
import java.io.PrintWriter;

/**
 * 学会打印流 特点 高效 方便写数据到文件中
 */
public class PrintWriterDemo2 {
    public static void main(String[] args) throws Exception {
        // 1创建一个打印流对象
        PrintWriter ps=new PrintWriter(new FileOutputStream("day10/src/ps3.txt",true));
        PrintWriter ps2=new PrintWriter("day10/src/ps2.txt","GBK");
        ps.println(97);
        ps.println('a');
        ps.println(12.1);
        ps.println(true);
        ps.write("看看能不能追加");
        ps.close();
    }
}
