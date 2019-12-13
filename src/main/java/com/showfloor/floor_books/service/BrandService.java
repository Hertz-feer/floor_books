package com.showfloor.floor_books.service;

import com.showfloor.floor_books.pojo.Brand;

import java.util.List;

/**
 * 品牌业务层
 */
public interface BrandService {

    /**
     * 查询所有品牌
     * @return
     */
    List<Brand> selectAll();

    /**
     * 根据名称查询
     * @param name
     * @return
     */
    Brand selectByName(String name);

    /**
     * 根据ID查询
     * @param id
     * @return
     */
    Brand selectById(Integer id);

    /**
     * 新增品牌
     * @param brand
     * @return
     */
    Brand insertBrand(Brand brand);

    /**
     * 删除
     * @param brand
     * @return
     */
    Integer deleteBrand(Brand brand);

    /**
     * 修改品牌
     * @param brand
     * @return
     */
    Integer updateBrand(Brand brand);
}
