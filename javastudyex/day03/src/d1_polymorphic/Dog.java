package d1_polymorphic;

public class Dog extends Animal{
    public String name="狗";
    @Override
    public void run() {
        System.out.println("狗跑的很快");
    }
}
