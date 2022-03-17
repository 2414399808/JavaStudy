package com.zsh.util;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;

public class SqlSessionFactoryUtils {
    private static SqlSessionFactory sqlSessionFactory;
   static{
       try {
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(Resources.getResourceAsStream("mybatis-config.xml"));

       } catch (IOException e) {
           e.printStackTrace();
       }
   }

    public static SqlSessionFactory getSqlSessionFactory(){
       return sqlSessionFactory;
    }
}
