package d3_static_test;

import java.util.Random;

public class VerifyTool {


    /*
    私有构造器
     */

    
    public VerifyTool() {
    }

    /*
        静态方法
         */
    public static String createCode(int n){
        //验证码
        String str="abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        String s="";
        Random random=new Random();
        for (int i = 0; i < n; i++) {
            s+=str.charAt(random.nextInt(63));

        }
        return s;
    }
}
