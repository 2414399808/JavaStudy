package com.zsh;

import com.zsh.Springbootdemo04JunitApplication;
import com.zsh.dao.BookDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


//当你的SpringBootTest文件所在包位置在引导文件的包下或其子包下 可以直接使用test方法 如果没有满足前面的条件必须要要进行classes属性配置 配置的是引导文件的字节码文件
@SpringBootTest(classes = Springbootdemo04JunitApplication.class)
class Springbootdemo04JunitApplicationTests {

    //1注入你要测试的对象
    @Autowired
    private BookDao bookDao;

    @Test
    void contextLoads() {
        System.out.println("test...");
    //2执行你要测试的对象对应的方法
        bookDao.save();
    }

}
