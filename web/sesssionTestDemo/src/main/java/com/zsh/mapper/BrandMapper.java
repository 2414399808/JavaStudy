package com.zsh.mapper;

import com.zsh.pojo.Brand;

import java.util.List;

public interface BrandMapper {
        List<Brand> selectAll();
        void addBrand(Brand brand);
        Brand selectById(Integer id);
        void updateBrand(Brand brand);
}
