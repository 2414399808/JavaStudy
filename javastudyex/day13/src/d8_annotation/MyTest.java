package d8_annotation;

import org.junit.Test;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.METHOD)//元注解 注解注解的注解
@Retention(RetentionPolicy.RUNTIME)//一直活着 在运行阶段这个注解也不会消\
public @interface MyTest {

}

