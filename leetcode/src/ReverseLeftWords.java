public class ReverseLeftWords {

    public static String reverseLeftWords(String s, int n) {
        StringBuffer sb=new StringBuffer(s.substring(n));

        for (int i = 0; i < n; i++) {
            sb.append(s.charAt(i));

        }
        return  sb.toString();

    }

    public static void main(String[] args) {
        System.out.println(reverseLeftWords("abcdefg", 2));
    }
}
