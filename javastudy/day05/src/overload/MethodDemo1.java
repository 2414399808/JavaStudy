package overload;

public class MethodDemo1 {
    public static void main(String[] args) {
        //目标 识别方法重载的形式 并理解其调用流程 最后需要知道方法重载的好处
        fire();
        fire("米国");
        fire("霓虹",10000);
    }
    public static void fire(){
        System.out.println("发射");
    }
    public static void fire(String location){
        System.out.println("向"+location+"发射");
    }
    public static void fire(String location, int number){
        System.out.println("向"+location+"发射"+number+"枚导弹");
    }
}
