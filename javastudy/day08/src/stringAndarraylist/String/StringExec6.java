package stringAndarraylist.String;

import java.util.Random;

public class StringExec6 {
    public static void main(String[] args) {
        String datas="abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        Random random=new Random();
        String str= "";
        // 循环5次 每次生成一个随机的索引 提取对应的字符链接起来即可
        for (int i = 0; i < 5; i++) {
            str+=datas.charAt(random.nextInt(datas.length()));
        }
        System.out.println(str);
    }
}
