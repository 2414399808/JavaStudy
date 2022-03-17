package branch;

public class CaseDemo2 {
    public static void main(String[] args) {
        //目标学会使用switch
        String weekday="周三";
        switch(weekday){
            case "周一" :
                System.out.println("埋头苦干，解决bug");
                break;
            case "周二" :
                System.out.println("请求大牛程序员帮忙");
                break;
            case "周三" :
                System.out.println("今晚啤酒龙虾");
                break;
            case "周四" :
                System.out.println("主动帮助新来的女程序员");
                break;
            case "周五" :
                System.out.println("今晚吃鸡");
                break;
            case "周六" :
                System.out.println("与王婆介绍的小芳相亲");
                break;
            case "周日" :
                System.out.println("郁郁寡欢，准备上班");
                break;
            default:
                System.out.println("数据输入有误");
        }
    }
}
