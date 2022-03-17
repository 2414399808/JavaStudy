package com.zsh.service;

import com.zsh.mapper.UserMapper;
import com.zsh.pojo.User;
import com.zsh.util.SqlSessionFactoryUtils;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

public class UserService implements UserServiceImpl{

        SqlSessionFactory sqlSessionFactory = SqlSessionFactoryUtils.getSqlSessionFactory();
    @Override
    public User selectByUsernameAndPassword(String username, String password) {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = mapper.select(username, password);
        sqlSession.close();
        return user;
    }

    @Override
    public User selectByUsername(String username) {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = mapper.selectByUsername(username);
        sqlSession.close();
        return user;
    }

    @Override
    public boolean add(User user) {
        SqlSession sqlSession = sqlSessionFactory.openSession(true);
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user1 = selectByUsername(user.getUsername());
        if(user1==null){
            mapper.add(user);
        }
        sqlSession.close();
        return  user1==null;
    }
}
