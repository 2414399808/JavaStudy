package d4_polymorphic_test;

public class Mouse implements USB{
    private String name;

    public String getName() {
        return name;
    }

    public Mouse() {
    }

    public Mouse(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void connect() {
        System.out.println("链接鼠标");
    }

    @Override
    public void unconnect() {
        System.out.println("拔出鼠标");
    }
    public void click(){
        System.out.println(name+"双击");
    }
}
