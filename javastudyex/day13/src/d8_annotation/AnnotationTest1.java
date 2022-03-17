package d8_annotation;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class AnnotationTest1 {
    @MyTest
    public void test1(){
        System.out.println("===test1===");
    }
    public void test2(){
        System.out.println("===test2===");
    }
    @MyTest
    public void test3(){
        System.out.println("===test3===");
    }

    /**
     * 启动菜单 有注解的才被调用
     * @param args
     */
    public static void main(String[] args) throws Exception {
        AnnotationTest1 t=new AnnotationTest1();
        //a 或取类对象
        Class c=AnnotationTest1.class;
        //b 提取全部方法
        Method[] declaredMethods = c.getDeclaredMethods();
        for (Method declaredMethod : declaredMethods) {
            //c 遍历方法 看看是否有MyTest注解 有就执行他
            if(declaredMethod.isAnnotationPresent(MyTest.class)){
                declaredMethod.invoke(t);
            }

        }
    }
}
