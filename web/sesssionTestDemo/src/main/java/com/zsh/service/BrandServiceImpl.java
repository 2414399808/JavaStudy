package com.zsh.service;

import com.zsh.pojo.Brand;

import java.util.List;

public interface BrandServiceImpl {
    List<Brand> selectAll();
    void addBrand(Brand brand);
    Brand selectById(Integer id);
    void updateBrand(Brand brand);
}
