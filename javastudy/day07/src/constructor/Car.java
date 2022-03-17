package constructor;

public class Car {
    String name;
    double price;
    public  Car(){
        System.out.println("无参构造器被调用。。。");
    }
    public Car(String n,double p){
        name=n;
        price=p;
        System.out.println("有参构造器被调用。。。");
    }
}
