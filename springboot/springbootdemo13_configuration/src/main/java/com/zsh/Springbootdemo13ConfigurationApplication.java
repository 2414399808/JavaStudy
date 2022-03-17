package com.zsh;

import com.alibaba.druid.pool.DruidDataSource;
import com.zsh.config.ServerConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableConfigurationProperties(ServerConfig.class)//可以理解为告诉spring容器ServerConfig要加载配置的参数 所有要先生成一个该类的bean放到容器中
public class Springbootdemo13ConfigurationApplication {

    @Bean
    @ConfigurationProperties("datasource")
    public DruidDataSource dataSource(){
        DruidDataSource ds=new DruidDataSource();

        return ds;
    }
    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(Springbootdemo13ConfigurationApplication.class, args);
        DruidDataSource bean = run.getBean(DruidDataSource.class);
        System.out.println(bean.getDriverClassName());
        ServerConfig bean1 = run.getBean(ServerConfig.class);
        System.out.println(bean1);
    }

}
