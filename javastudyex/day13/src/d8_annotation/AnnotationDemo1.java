package d8_annotation;

/**
 * 目标 学会自定义注解 掌握其定义格式和语法
 */
@MyBook(name = "西游记", authors = {"罗贯中"}, price = 100.0)
//@Book(value = "/delete")
@Book("/delete")
public class AnnotationDemo1 {
    @MyBook(name = "西游记", authors = {"罗贯中"}, price = 100.0)
    private AnnotationDemo1(){

    }
    @MyBook(name = "西游记", authors = {"罗贯中"}, price = 100.0)
    public static void main(String[] args) {
        @MyBook(name = "西游记", authors = {"罗贯中"}, price = 100.0)
        int age=10;
    }
}

