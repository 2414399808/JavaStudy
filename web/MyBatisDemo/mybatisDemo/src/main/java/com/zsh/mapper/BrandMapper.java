package com.zsh.mapper;

import com.zsh.pojo.Brand;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface BrandMapper {
    /**
     * 查询所有
     */
    List<Brand> selectAll();
    /**
     * 查看详情 根据id查询
     */
    Brand selectById(int id);

    /**
     * 条件查询
     *  参数接收
     *     1 散装参数 @Param("sql参数占位符名称") Object
     *     2 对象参数
     *     3 map参数

     * @return
     */
//      List<Brand> selectByCondition(@Param("status") int status,@Param("companyName") String companyName ,@Param("brandName") String brandName);
//      List<Brand> selectByCondition(Brand brand);
        List<Brand> selectByCondition(Map map);

        List<Brand> selectByConditionSingle(Brand brand);


    /**
     * 添加
     */

    void add(Brand brand);

    /**
     * 修改
     */
    Integer update(Brand brand);

    /**
     * 根据id删除
     */
    void deleteById(int id);

    /**
     * 批量删除
     */
//    void deleteByIds(@Param("ids") int[] ids);
    void deleteByIds(int[] ids);

}
