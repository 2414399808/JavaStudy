package d5_exception_javac;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class ExceptionDemo {
    public static void main(String[] args) throws ParseException {
        String date="2015-01-12 10:23:21";
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(simpleDateFormat.parse(date));
    }
}
