package d11_genericity_limit;

import java.util.ArrayList;

/**
    目标：泛型通配符。?

    需求：开发一个极品飞车的游戏，所有的汽车都能一起参与比赛。

    注意：
        虽然BMW和BENZ都继承了Car
        但是ArrayList<BMW>和ArrayList<BENZ>与ArrayList<Car>没有关系的！!
    通配符：？
        ？可以在“使用泛型”的时候代表一切类型。
        E T K V 是在定义泛型的时候使用的。
    泛型的上下限：
        ？ extends Car : ?必须是Car或者其子类  泛型上限
        ? super Car ：？必须是Car或者其父类   泛型下限
    小结：
        通配符：？
        ？可以在“使用泛型”的时候代表一切类型。

 */
public class GenericDemo {
    public static void main(String[] args) {
        ArrayList<BMW> bmws = new ArrayList<>();
        bmws.add(new BMW("benz"));
        bmws.add(new BMW("benz"));
        bmws.add(new BMW("benz"));

        go(bmws);

        ArrayList<BENZ> benzs = new ArrayList<>();
        benzs.add(new BENZ("bmw"));
        benzs.add(new BENZ("bmw"));
        benzs.add(new BENZ("bmw"));
        go(benzs);

        ArrayList<Dog> dogs = new ArrayList<>();
        dogs.add(new Dog());
        dogs.add(new Dog());
        dogs.add(new Dog());
        // go(dogs);
    }

    /**
       所有车比赛
     */
    public static void go(ArrayList<? extends Car> cars){
        System.out.println(cars);
    }
    public static void goes(ArrayList<? super Car> cars){
    }
}

class Dog{

}

class BENZ extends Car{
    private String name;

    public BENZ() {
    }

    public BENZ(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "BENZ{" +
                "name='" + name + '\'' +
                '}';
    }
}

class BMW extends Car{
    private String name;

    public BMW() {
    }

    public BMW(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "BENZ{" +
                "name='" + name + '\'' +
                '}';
    }
}

// 父类
class Car{
}














