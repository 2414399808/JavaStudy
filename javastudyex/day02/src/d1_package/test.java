package d1_package;

import d1_package.demo1.Animal;
import d1_package.demo1.Cat;

public class test {
    public static void main(String[] args) {
        //导包 相同包下的类可以直接访问
        Student student=new Student();
        // 不同包下的类需要导包
        Animal animal= new Animal();
        // 使用默认导包的类
        Cat cat=new Cat();
        //使用特定导包的类
        d1_package.demo2.Cat cat2=new d1_package.demo2.Cat();
    }
}
