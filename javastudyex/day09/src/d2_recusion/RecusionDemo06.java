package d2_recusion;

/**
 * 啤酒问题
 */
public class RecusionDemo06 {
    private static int totalnumber=0;
    private static int lastBottleNumber=0;
    private static int lastCoverNumber=0;
    public static void main(String[] args) {
        drink(10);
        System.out.println(totalnumber);
        System.out.println(lastBottleNumber);
        System.out.println(lastCoverNumber);
    }
    public static void drink(int money){

      int buyNumber=money/2;
      totalnumber+=buyNumber;
      int coverNumber=lastCoverNumber+buyNumber;
      int bottleNumber=lastBottleNumber+buyNumber;
      int allMoney=0;
      if(coverNumber>=4){
          allMoney+=(coverNumber/4)*2;

      }
      lastCoverNumber=coverNumber%4;
        if(bottleNumber>=2){
            allMoney+=(bottleNumber/2)*2;

        }
        lastBottleNumber=bottleNumber%2;
        if(allMoney>=2){
            drink(allMoney);
        }
    }
}
