package d5_innerclass_static;

public class Test {
    public static void main(String[] args) {
        Outer.Inner inner=new Outer.Inner();
        inner.setAge(20);
        inner.setName("zsh");
        Outer.Inner.pp();
    }
}
