package d8_exception_handle_runtime;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(true){
            double price = 0;
            try {
                System.out.println("请您输入合法的价格");
                String priceStr = sc.nextLine();
                price = Double.valueOf(priceStr);
                //判断价格是否大于0；
                if(price>0){
                    System.out.println("定价"+price);
                    break;
                }
                else{
                    System.out.println("价格必须是正数");

                }
            } catch (NumberFormatException e) {
                System.out.println("请您输入合法的数据，建议为正数");
                e.printStackTrace();
            }


        }
    }
}
