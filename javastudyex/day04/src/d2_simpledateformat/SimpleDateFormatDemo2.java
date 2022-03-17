package d2_simpledateformat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatDemo2 {
    public static void main(String[] args) throws ParseException {
        //目标 学会使用SimpleDateFormat解析字符串时间成为日期对象
        //有一个时间 2021 年8月6日 11，11，11 往后 2天14小时49分钟 06秒后的时间是多少
        //1把字符串时间拿到程序中来
        String dateStr="2021年08月06日 11:11:11";
        //2把字符串时间解析成日期对象（重点）
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        Date parse = simpleDateFormat.parse(dateStr);
        System.out.println(parse);

        //3往后走2天 14小时 49分 06秒
        long l=parse.getTime();
        parse.setTime(l+(2*24*60*60+14*60*60+49*60+6)*1000);
        //4格式化这个时间毫秒值就是结果
        System.out.println(simpleDateFormat.format(parse));
    }
}
