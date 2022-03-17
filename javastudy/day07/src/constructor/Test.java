package constructor;

public class Test {
    public static void main(String[] args) {
        Car car=new Car();
        Car car1=new Car("benz",5000000);
        System.out.println(car1.price);
    }
}
