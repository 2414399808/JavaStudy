package com.zsh.config;

import com.zsh.custom.CustomBeanNameGenerator;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(value = "com",nameGenerator = CustomBeanNameGenerator.class)//不写参数时 默认扫描此文件所在包及其子包
public class SpringConfiguration {

}
