package d4_polymorphic_test;

public class KeyBoard implements USB{
    private String name;

    public String getName() {
        return name;
    }

    public KeyBoard() {
    }

    public KeyBoard(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void connect() {
        System.out.println("连接键盘");
    }

    @Override
    public void unconnect() {
        System.out.println("拔出键盘");
    }
    public void keyDown(){
        System.out.println(name+"在大键盘");
    }
}
