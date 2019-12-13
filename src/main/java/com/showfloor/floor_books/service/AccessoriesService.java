package com.showfloor.floor_books.service;

import com.showfloor.floor_books.pojo.Accessories;

import java.util.List;
/**
 * 辅料业务层
 */
public interface AccessoriesService {

    /**
     * 查询所有
     * @return
     */
    List<Accessories> getAll();

    /**
     * 根据配件名称模糊查询
     * @param name
     * @return
     */
    List<Accessories> selectByName(String name);

    /**
     * 根据供应商名称
     * @param brand
     * @return
     */
    List<Accessories> selectByBrand(String brand);

    /**
     * 创建配件
     * @param accessories
     * @return
     */
    Accessories createAccessories(Accessories accessories);

    /**
     * 删除配件
     * @param accessories
     * @return
     */
    void deleteAccessories(Accessories accessories);

    /**
     * 删除配件
     * @param accessories
     * @return
     */
    void updateAccessories(Accessories accessories);
}
