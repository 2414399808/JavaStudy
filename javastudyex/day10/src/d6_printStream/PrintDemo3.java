package d6_printStream;

import java.io.FileNotFoundException;
import java.io.PrintStream;

/**
 * 目标 了解改变输出语句的位置到文件
 */
public class PrintDemo3 {
    public static void main(String[] args) throws Exception {
        System.out.println("锦瑟无端五十弦");
        System.out.println("一线一柱思华年");

        //改变输出语句的位置（重定向

        PrintStream ps=new PrintStream("day10/src/wenjan.txt");
        System.setOut(ps);
        System.out.println("锦瑟无端五十弦");
        System.out.println("一线一柱思华年");

    }
}
