package d2_simpledateformat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatTest {
    public static void main(String[] args) throws ParseException {
        //1 开始 和结束时间
        String startTime="2021-11-11 00:00:00";
        String endTime="2021-11-11 00:10:00";

        //2 小贾小皮
        String xiaoJia="2021-11-11 00:03:47";
        String xiaoPi="2021-11-11 00:10:11";
        //3判断
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date startTime2 = simpleDateFormat.parse(startTime);
        Date endTime2 = simpleDateFormat.parse(endTime);
        Date jia = simpleDateFormat.parse(xiaoJia);
        Date pi = simpleDateFormat.parse(xiaoPi);
        if(jia.after(endTime2)&&jia.before(startTime2)){
            System.out.println("小贾秒杀成功");
        }
        else{
            System.out.println("小贾秒杀成功");
        }
        if(pi.after(endTime2)&&pi.before(startTime2)){
            System.out.println("小皮秒杀成功");
        }
        else{
            System.out.println("小皮秒杀失败");
        }
    }
}
