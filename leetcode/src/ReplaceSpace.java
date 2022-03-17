public class ReplaceSpace {


    public static String replaceSpace(String s) {
       StringBuffer sb=new StringBuffer(s);
        for (int i = 0; i < sb.length(); i++) {
            if(sb.charAt(i)==' '){
                sb.replace(i,i+1,"%20");
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        String s = replaceSpace("we are family");
        System.out.println(s);
    }
}
