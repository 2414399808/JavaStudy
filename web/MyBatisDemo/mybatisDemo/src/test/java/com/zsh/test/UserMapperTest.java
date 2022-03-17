package com.zsh.test;

import com.zsh.mapper.UserMapper;
import com.zsh.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.HashSet;

public class UserMapperTest {
    @Test
    public void testSelect() throws Exception {
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(Resources.getResourceAsStream("mybatis-config.xml"));
        SqlSession sqlSession = sqlSessionFactory.openSession(true);
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
//        User zhangsan = mapper.select("zhangman", "123");
        User zhangsan =mapper.select(new HashSet());
        System.out.println(zhangsan);

    }
}
