package d12_extends_constructor;

public class Cat extends Animal{
    public Cat(){
        super();//默认的 写不写都在 即调用子类构造器之前会先调用父类构造器 创建类对象 中的父类空间 然后利用父类空间里的数据来创建子类空间
        System.out.println("==子类Cat无参构造器被执行==");
    }
    public Cat(int n){
        System.out.println("==子类Cat有参构造器被执行==");
    }
}
