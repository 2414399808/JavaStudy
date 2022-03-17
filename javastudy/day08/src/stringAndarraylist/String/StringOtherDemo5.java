package stringAndarraylist.String;

public class StringOtherDemo5 {
    public static void main(String[] args) {
        // 1、public int length(): 获取字符串的长度
        String name="我爱你中国";
        System.out.println(name.length());

        // 2、public char charAt(int index): 获取某个索引位置处的字符
        System.out.println(name.charAt(0));

        System.out.println("-----------------遍历字符串的每个字符----------------");
        for (int i = 0; i < name.length(); i++) {
            System.out.print(name.charAt(i));
        }
        System.out.println();
        // 3、public char[] toCharArray()：: 把字符串转换成字符数组
        char[] chars = name.toCharArray();
        System.out.println(chars);
        // 4、public String substring(int beginIndex, int endIndex) ：截取内容，(包前不包后的)
        String substring = name.substring(2,4);
        System.out.println(substring);

        // 5、public String substring(int beginIndex):从当前索引一直截取到末尾
        String substring1 = name.substring(2);
        System.out.println(substring1);
        // 6、public String replace(CharSequence target, CharSequence replacement)
        String name3="金三胖是最厉害的80后,金三胖牛的";
        String s = name3.replace("金三胖", "***");
        System.out.println(s);

        // 7、public boolean contains(CharSequence s)
        boolean b = name.contains("中");
        System.out.println(b);
        // 8、public boolean startsWith(String prefix)
        boolean b1 = name.startsWith("我");
        System.out.println(b1);
        // 9、public String[] split(String s): 按照某个内容把字符串分割成字符串数组返回。
        String str="1,2,3,4,5,6,7,8,9,10";
        String[] split = str.split(",");
        for (int i = 0; i < split.length; i++) {
            System.out.print(split[i]+" ");

        }

    }
}
