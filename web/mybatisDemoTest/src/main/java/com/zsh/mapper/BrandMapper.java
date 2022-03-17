package com.zsh.mapper;

import com.zsh.pojo.Brand;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface BrandMapper {
        List<Brand> selectAll();
        Brand selectById(int id);
        List<Brand> selectByCondition(@Param("status") Integer status,@Param("brandName") String BrandName,@Param("companyName") String companyName);

        List<Brand> selectByCondition(Brand brand);
        List<Brand> selectByCondition(Map map);
        List<Brand> selectByConditionSingle(Brand brand);

        void add(Brand brand);
        Integer updateById(Brand brand);
        void deleteByIds(@Param("ids") int[] ids);
}
