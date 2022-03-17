package d6_regex;

public class RegexDemo4 {
    public static void main(String[] args) {
        String names="小路asdfjhsd蓉儿asdfhnsdjkf过儿";
        String[] split = names.split("\\w+");
        for (int i = 0; i < split.length; i++) {
            System.out.println(split[i]);

        }

        String names2=names.replaceAll("\\w+","  ");
        System.out.println(names2);
    }
}
