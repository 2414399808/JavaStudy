package createobject;

public class Test {
    public static void main(String[] args) {
        //自己设计对象使用
        Car car=new Car();
        car.name="benz";
        car.price=10000000;
        car.start();
        car.run();
        Car car2=new Car();
        car2.name="benzxxx";
        car2.price=20000000;
        car2.start();
        car2.run();
    }
}
