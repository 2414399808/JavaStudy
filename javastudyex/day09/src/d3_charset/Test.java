package d3_charset;

import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/**
 * 学会自己进行文字的编码和解码 为以后可能用到的场景做准备
 */
public class Test {
    public static void main(String[] args) throws UnsupportedEncodingException {
        //1 编码 把文件转换成字节 使用指定的编码
        String name="abc我爱你中国";
        byte[] bytes2 = name.getBytes();// 以当前代码默认字符集进行编码
        byte[] bytes = name.getBytes("GBK");
        System.out.println(bytes.length);
        System.out.println(Arrays.toString(bytes));

        //2解码 把字节转换成对应的中文形式 编码前和编码后的字符集必须一致否则乱码
        String s = new String(bytes);
        System.out.println(s);
        String s2 = new String(bytes2);
        System.out.println(s2);
        //也可以指定GBK解码
        String s1 = new String(bytes, "GBK");
        System.out.println(s1);
    }
}
