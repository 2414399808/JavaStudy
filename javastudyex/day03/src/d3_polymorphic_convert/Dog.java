package d3_polymorphic_convert;

public class Dog extends Animal {
    public String name="狗";
    @Override
    public void run() {
        System.out.println("狗跑的很快");
    }
    public void lookDoor(){
        System.out.println("狗崽看门");
    }
}
