package com.zsh;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Bean;

//properties属性可以为当前测试用例添加临时的属性配置
//args属性可以为当前测试用例添加临时的命令行参数
//优先级 args>properties
@SpringBootTest(args = {"--test.prop=testValue2"})//(properties = {"test.prop=testValue1"})
public class PropertiesAndArgsTest {



    @Value("${test.prop}")
    private String msg;

    @Test
    public void testProperties(){
        System.out.println(msg);
    }
}
