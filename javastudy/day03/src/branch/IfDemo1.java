package branch;

import java.util.Scanner;

public class IfDemo1 {
    public static void main(String[] args) {
        //需求 心跳（60 - 100）之间时正常的，否则系统提示进一步检查
        //格式1：if（条件表达式）{代码。。。。}
        //格式2：if（条件表达式）{代码。。。。} else{}
        //格式3：if（条件表达式）{代码。。。。} elseif{} 。。。 else{}
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入您的心跳：");
        int heartbeat=sc.nextInt();
        if(heartbeat>60&&heartbeat<100){
            System.out.println("您的心跳数据是："+heartbeat+"心跳正常");
        }
        else{
            System.out.println("您的心跳不太正常");
        }
    }
}
