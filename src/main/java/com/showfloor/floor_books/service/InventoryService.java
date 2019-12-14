package com.showfloor.floor_books.service;

import com.showfloor.floor_books.pojo.Inventory;

import java.util.List;

public interface InventoryService {

    /**
     * 根据地板Id查询
     * @return
     */
    Inventory selectById(Integer id);
    /**
     * 根据地板名称查询
     * @param name
     * @return
     */
    List<Inventory> selectByName(String name);

    /**
     * 查询所有
     * @return
     */
    List<Inventory> selectAll();

    /**
     * 根据品牌查询
     * @param brand
     * @return
     */
    List<Inventory> selectByBrand(String brand);

    /**
     * 修改库存表
     * @return
     */
    Inventory updateInventory(Inventory inventoryOfFloor);

    /**
     * 增库库存
     * @param inventoryOfFloor
     * @return
     */
    Inventory InsertInventory(Inventory inventoryOfFloor);
}
