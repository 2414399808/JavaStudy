package d6_regex;

public class RegexDemo1 {
    public static void main(String[] args) {
        //需求 校验qq号码 必须全部数字6-20位
        System.out.println(checkQQ("4239874892"));
        System.out.println("-------------------");
        //正则表达式体验
        System.out.println(checkQQ2("4239874892"));
    }
    public static boolean checkQQ2(String qq){
        return qq!=null&&qq.matches("\\d{6,20}");
    }
    public static boolean checkQQ(String qq){
        //1 判断qq号码的长度是否满足条件
        if(qq==null||qq.length()<6||qq.length()>20){
            return false;
        }

        //2 判断qq中是否全部是数字
        for (int i = 0; i < qq.length(); i++) {
            if(qq.charAt(i)<'0'||qq.charAt(i)>'9')
                return false;
        }
        return true;

    }
}
