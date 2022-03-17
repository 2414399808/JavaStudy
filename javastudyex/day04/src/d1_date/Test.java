package d1_date;

import java.util.Date;

public class Test {
    public static void main(String[] args) {
        Date d=new Date();
        System.out.println(d);
        long l=d.getTime();
        System.out.println(l);
        long l2=l+(60*60+121)*1000;
        //1
        Date d2=new Date(l2);
        System.out.println(d2);
        Date d3=new Date();
        d3.setTime(l2);
        System.out.println(d3);
    }
}
