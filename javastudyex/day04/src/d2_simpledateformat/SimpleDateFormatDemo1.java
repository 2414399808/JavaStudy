package d2_simpledateformat;

import java.text.SimpleDateFormat;
import java.util.Date;

/*
目标 SimpleDateFormat 简单日期格式化类的使用
格式化时间
解析时间
 */
public class SimpleDateFormatDemo1 {
    public static void main(String[] args) {
        Date d=new Date();
        System.out.println(d);
        // 格式化这个日期对象（指定最终格式化的形式
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss EEE a");
        //开始格式化日期对象成为喜欢的字符串格式

        System.out.println(simpleDateFormat.format(d));
        System.out.println("-------------------------");
        //格式化时间毫秒值
        // 需求 请问121秒之后的时间是多少
        long time=System.currentTimeMillis();
        String rs=simpleDateFormat.format(time);
        System.out.println(rs);
        System.out.println("-------------------------");

    }
}
