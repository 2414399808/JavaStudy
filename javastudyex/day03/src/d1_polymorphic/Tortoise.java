package d1_polymorphic;

public class Tortoise extends Animal{
    public String name="乌龟";
    @Override
    public void run() {
        System.out.println("乌龟怕的很慢");
    }
}
