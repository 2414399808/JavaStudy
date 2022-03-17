package d8_annotation;

import org.junit.Test;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * 目标 完成注解解析
 */
public class AnnotationDemo3 {
    @Test
    public void parseClass(){
        //a 先得到类对象
        Class c = BookStore.class;
        //b 判断这个类上面是否存在这个注解
        if (c.isAnnotationPresent(Bookk.class)) {

            //c直接获取该注解对象
            Bookk book = (Bookk)c.getDeclaredAnnotation(Bookk.class);
            System.out.println(book.value());
            System.out.println(Arrays.toString(book.author()));
        }

    }
    @Test
    public void parseMethod() throws Exception {
        Class c1=BookStore.class;
        Method test = c1.getDeclaredMethod("test");
        if(test.isAnnotationPresent(Bookk.class)){
            Bookk book1 = test.getAnnotation(Bookk.class);
            System.out.println(book1.value());
        }

    }
}
@Bookk(value="《情深深雨蒙蒙》",price = 99.9,author = {"琼瑶","地雷"})
class BookStore{
    @Bookk(value="《三少爷的剑》",price = 99.9,author = {"琼瑶","地雷"})
    public void test(){

    }
}
