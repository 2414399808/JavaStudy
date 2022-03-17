package com.zsh.test;

import com.baomidou.mybatisplus.core.MybatisSqlSessionFactoryBuilder;
import com.zsh.mapper.UserMapper;
import com.zsh.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.util.List;

public class MybatisPlusTest {


    @Test
    public void testFindAll() throws IOException {
        SqlSessionFactory sqlSessionFactory = new MybatisSqlSessionFactoryBuilder().build(Resources.getResourceAsStream("mybatis-config.xml"));
        SqlSession sqlSession = sqlSessionFactory.openSession(true);
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> userList = mapper.selectList(null);
        System.out.println(userList);
    }
}
