package com.zsh;

import com.zsh.mapper.UserMapper;
import com.zsh.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * Mybatis 快速入门代码
 */
public class MyBatisDemo {
    @Test
    public void testSelect() throws Exception {
        //1 加载mybatis的核心配置文件 获取 SqlSessionFactory
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        //2 获取SqlSession对象 用它来执行sql
        SqlSession sqlSession = sqlSessionFactory.openSession();


        //3 执行sql
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        List<User> users = userMapper.selectAll();
        System.out.println(users);

        sqlSession.close();
    }
    @Test
    public void testUpdate() throws Exception {
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(Resources.getResourceAsStream("mybatis-config.xml"));
        SqlSession sqlSession = sqlSessionFactory.openSession();
        int update = sqlSession.update("test.updatePassword");
        if(update>0){
            System.out.println("修改成功");
        }
        else{
            System.out.println("修改失败");
        }
    }
}
