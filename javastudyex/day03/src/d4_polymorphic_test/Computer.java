package d4_polymorphic_test;

public class Computer {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Computer(String name) {
        this.name = name;
    }

    public Computer() {
    }
    public void installUSB(USB usb){
        //多态 usb可能是鼠标可能是键盘
        usb.connect();
        usb.unconnect();
       if(usb instanceof Mouse){
           Mouse m=(Mouse) usb;
           m.click();
       }
       else{
           KeyBoard k=(KeyBoard) usb;
           k.keyDown();
       }
    }
}
