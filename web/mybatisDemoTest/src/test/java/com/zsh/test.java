package com.zsh;

import com.zsh.mapper.BrandMapper;
import com.zsh.pojo.Brand;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class test {
        @Test
    public void selectAll() throws Exception {
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(Resources.getResourceAsStream("mybatis-config.xml"));
            SqlSession sqlSession = sqlSessionFactory.openSession(true);
            BrandMapper mapper = sqlSession.getMapper(BrandMapper.class);
            List<Brand> brands = mapper.selectAll();
            System.out.println(brands);
            sqlSession.close();
        }
    @Test
    public void selectById() throws Exception {
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(Resources.getResourceAsStream("mybatis-config.xml"));
        SqlSession sqlSession = sqlSessionFactory.openSession(true);
        BrandMapper mapper = sqlSession.getMapper(BrandMapper.class);
        Brand brand = mapper.selectById(1);
        System.out.println(brand);
        sqlSession.close();
    }
    @Test
    public void selectByCondition() throws Exception {
            Brand brand=new Brand();
            brand.setStatus(1);
            brand.setBrandName("%华为%");
            brand.setCompanyName("%华为%");
            Map map=new HashMap();
            map.put("status",1);
            map.put("brandName","%华为%");
            map.put("companyName","%华为%");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(Resources.getResourceAsStream("mybatis-config.xml"));
        SqlSession sqlSession = sqlSessionFactory.openSession(true);
        BrandMapper mapper = sqlSession.getMapper(BrandMapper.class);
//        List<Brand> brands = mapper.selectByCondition(1, "%华为%", "%华为%");
//        List<Brand> brands = mapper.selectByCondition(brand);
        List<Brand> brands = mapper.selectByCondition(map);
        System.out.println(brands);
        sqlSession.close();
    }
    @Test
    public void selectByConditionSingle() throws Exception {
        Brand brand=new Brand();
        brand.setStatus(1);
//        brand.setBrandName("%华为%");
//        brand.setCompanyName("%华为%");
        Map map=new HashMap();
        map.put("status",1);
//        map.put("brandName","%华为%");
//        map.put("companyName","%华为%");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(Resources.getResourceAsStream("mybatis-config.xml"));
        SqlSession sqlSession = sqlSessionFactory.openSession(true);
        BrandMapper mapper = sqlSession.getMapper(BrandMapper.class);
//        List<Brand> brands = mapper.selectByCondition(1, "%华为%", "%华为%");
        List<Brand> brands = mapper.selectByCondition(brand);
//        List<Brand> brands = mapper.selectByCondition(map);
        System.out.println(brands);
        sqlSession.close();
    }
    @Test
    public void testAdd() throws Exception {
        SqlSessionFactory build = new SqlSessionFactoryBuilder().build(Resources.getResourceAsStream("mybatis-config.xml"));
        SqlSession sqlSession = build.openSession(true);
        BrandMapper mapper = sqlSession.getMapper(BrandMapper.class);
        mapper.add(new Brand("波导手机","波导手机",3,"波导手机手机中的战斗机",1));
        sqlSession.close();
    }
    @Test
    public void testupdate() throws Exception {
        SqlSessionFactory build = new SqlSessionFactoryBuilder().build(Resources.getResourceAsStream("mybatis-config.xml"));
        SqlSession sqlSession = build.openSession(true);
        BrandMapper mapper = sqlSession.getMapper(BrandMapper.class);
        Brand brand=new Brand();
        brand.setStatus(0);
        brand.setId(4);
        Integer integer = mapper.updateById(brand);
        System.out.println(integer);
        sqlSession.close();
    }
    @Test
    public void testDeleteById() throws Exception {
        SqlSessionFactory build = new SqlSessionFactoryBuilder().build(Resources.getResourceAsStream("mybatis-config.xml"));
        SqlSession sqlSession = build.openSession(true);
        BrandMapper mapper = sqlSession.getMapper(BrandMapper.class);
        Brand brand=new Brand();
        brand.setStatus(0);
        brand.setId(4);
       mapper.deleteByIds(new int[]{4, 5});

        sqlSession.close();
    }
}

