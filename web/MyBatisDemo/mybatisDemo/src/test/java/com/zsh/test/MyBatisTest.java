package com.zsh.test;

import com.zsh.mapper.BrandMapper;
import com.zsh.pojo.Brand;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MyBatisTest {

    @Test
    public void testSelectAll() throws Exception {
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(Resources.getResourceAsStream("mybatis-config.xml"));
        SqlSession sqlSession = sqlSessionFactory.openSession();
        BrandMapper mapper = sqlSession.getMapper(BrandMapper.class);
        List<Brand> brands = mapper.selectAll();
        System.out.println(brands);
        sqlSession.close();
    }
    @Test
    public void testSelectById() throws Exception {
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(Resources.getResourceAsStream("mybatis-config.xml"));
        SqlSession sqlSession = sqlSessionFactory.openSession();
        BrandMapper mapper = sqlSession.getMapper(BrandMapper.class);
        Brand brand = mapper.selectById(2);
        System.out.println(brand);
        sqlSession.close();
    }
    @Test
    public void testSelectByCondition() throws Exception {
        int status=1;
        String companyName="华为";
        String brandName="华为";
        companyName="%"+companyName+"%";
        brandName="%"+brandName+"%";
        Brand brand=new Brand();
        brand.setStatus(1);
        brand.setBrandName(brandName);
        brand.setCompanyName(companyName);

        Map map=new HashMap();
        map.put("status",status);
//        map.put("companyName",companyName);
//        map.put("brandName",brandName);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(Resources.getResourceAsStream("mybatis-config.xml"));
        SqlSession sqlSession = sqlSessionFactory.openSession();
        BrandMapper mapper = sqlSession.getMapper(BrandMapper.class);
//        List<Brand> brands = mapper.selectByCondition(status,companyName,brandName);
//        List<Brand> brands = mapper.selectByCondition(brand);
        List<Brand> brands = mapper.selectByCondition(map);
        System.out.println(brands);
        sqlSession.close();
    }


    @Test
    public void testSelectByConditionSingle() throws Exception {
        int status=1;
        String companyName="华为";
        String brandName="华为";
        companyName="%"+companyName+"%";
        brandName="%"+brandName+"%";
        Brand brand=new Brand();
//        brand.setStatus(1);
//        brand.setBrandName(brandName);
//        brand.setCompanyName(companyName);


        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(Resources.getResourceAsStream("mybatis-config.xml"));
        SqlSession sqlSession = sqlSessionFactory.openSession();
        BrandMapper mapper = sqlSession.getMapper(BrandMapper.class);

        List<Brand> brands = mapper.selectByConditionSingle(brand);

        System.out.println(brands);
        sqlSession.close();
    }

    @Test
    public void addBrand() throws Exception {
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(Resources.getResourceAsStream("mybatis-config.xml"));
        SqlSession sqlSession = sqlSessionFactory.openSession(true);//关闭事务
        BrandMapper mapper = sqlSession.getMapper(BrandMapper.class);
        Brand brand=new Brand("波导手机","波导手机",3,"波导手机手机中的战斗机",1);
        mapper.add(brand);


        //提交事务
        sqlSession.commit();
        sqlSession.close();
    }
    @Test
    public void addBrand2() throws Exception {
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(Resources.getResourceAsStream("mybatis-config.xml"));
        SqlSession sqlSession = sqlSessionFactory.openSession(true);//关闭事务
        BrandMapper mapper = sqlSession.getMapper(BrandMapper.class);
        Brand brand=new Brand("波导手机","波导手机",3,"波导手机手机中的战斗机",1);
        mapper.add(brand);
        System.out.println(brand.getId());

        //提交事务
        sqlSession.commit();
        sqlSession.close();
    }
    @Test
    public void updateById() throws Exception {
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(Resources.getResourceAsStream("mybatis-config.xml"));
        SqlSession sqlSession = sqlSessionFactory.openSession(true);
        BrandMapper mapper = sqlSession.getMapper(BrandMapper.class);
        Brand brand=new Brand(7,"宫廷玉液酒","宫廷玉液酒有限公司",7,"宫廷玉液酒，一百八一杯",1);
        Integer update = mapper.update(brand);
        System.out.println(update);
        sqlSession.close();

    }
    @Test
    public void updateById2() throws Exception {
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(Resources.getResourceAsStream("mybatis-config.xml"));
        SqlSession sqlSession = sqlSessionFactory.openSession(true);
        BrandMapper mapper = sqlSession.getMapper(BrandMapper.class);
        Brand brand=new Brand();
        brand.setStatus(0);
        brand.setId(7);
        Integer update = mapper.update(brand);
        System.out.println(update);
        sqlSession.close();

    }

    @Test
    public void testDeleteById() throws Exception {
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(Resources.getResourceAsStream("mybatis-config.xml"));
        SqlSession sqlSession = sqlSessionFactory.openSession(true);
        BrandMapper mapper = sqlSession.getMapper(BrandMapper.class);
        mapper.deleteById(5);
        sqlSession.close();
    }
    @Test
    public void testDeleteByIds() throws Exception {
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(Resources.getResourceAsStream("mybatis-config.xml"));
        SqlSession sqlSession = sqlSessionFactory.openSession(true);
        BrandMapper mapper = sqlSession.getMapper(BrandMapper.class);
        int[] ids={6,7};
        mapper.deleteByIds(ids);
        sqlSession.close();
    }
}
