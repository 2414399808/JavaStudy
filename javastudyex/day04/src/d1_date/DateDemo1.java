package d1_date;

import java.util.Date;

/**
 * 目标 学会使用Date类处理时间，获取时间的信息
 */
public class DateDemo1 {
    public static void main(String[] args) {
        //1 创建一个Date类的对象 代表系统此刻日期时间对象
        Date d=new Date();
        System.out.println(d);
        //2 获取时间毫秒值
        long time=d.getTime();
        System.out.println(time);
        long time1=System.currentTimeMillis();
        System.out.println(time1);

        System.out.println("---------------");
        System.out.println(d);
        long time2=System.currentTimeMillis();
        time2+=(60*60+121)*1000;
        Date d2=new Date(time2);
        d2.setTime(time2);
        System.out.println(d2);
    }
}
