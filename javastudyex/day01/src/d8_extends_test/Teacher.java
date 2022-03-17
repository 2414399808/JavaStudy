package d8_extends_test;

public class Teacher extends Role{
    private String bmName;
    public void question(){
        System.out.println("问题");
    }

    public String getBmName() {
        return bmName;
    }

    public void setBmName(String bmName) {
        this.bmName = bmName;
    }
}
