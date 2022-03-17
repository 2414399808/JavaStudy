package d8_annotation;

import org.junit.Test;

import java.lang.reflect.Method;

public class AnnotationDemotest {
    @Test
    public void getType(){
        Class c=FishShop.class;
        if(c.isAnnotationPresent(Fish.class)){
            Fish fish1 = (Fish)c.getDeclaredAnnotation(Fish.class);
            System.out.println(fish1.name());
            System.out.println(fish1.price());
            System.out.println(fish1.number());

        }
    }
    @Test
    public void getMethod() throws NoSuchMethodException {
        Class c=FishShop.class;
        Method buy = c.getMethod("buy");
        if(buy.isAnnotationPresent(Fish.class)){
            Fish fish1 = buy.getDeclaredAnnotation(Fish.class);
            System.out.println(fish1.name());
            System.out.println(fish1.price());
            System.out.println(fish1.number());
        }
    }
}
@Fish(name = "鲑鱼", price = 1000.0, number = 10)
class FishShop{
    @Fish(name = "鲤鱼", price = 50.0, number = 20)
    public void buy(){



    }

}
