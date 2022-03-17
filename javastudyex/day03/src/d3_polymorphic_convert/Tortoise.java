package d3_polymorphic_convert;

public class Tortoise extends Animal {
    public String name="乌龟";
    @Override
    public void run() {
        System.out.println("乌龟怕的很慢");
    }
    public void egg(){
        System.out.println("乌龟在下蛋");
    }
}
