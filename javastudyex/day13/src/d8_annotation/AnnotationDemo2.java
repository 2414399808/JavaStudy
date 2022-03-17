package d8_annotation;

/**
 * 目标 认识元注解
 */
//@MyTest//只能注解方法和变量
public class AnnotationDemo2 {


    private String name;
    @MyTest
    public void test(){

    }
    @MyTest
    public static void main(String[] args) {

    }
}
