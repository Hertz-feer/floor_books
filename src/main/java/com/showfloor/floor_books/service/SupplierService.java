package com.showfloor.floor_books.service;

import com.showfloor.floor_books.pojo.Supplier;

import java.util.List;

public interface SupplierService {

    /**
     * 根据ID查询
     * @param id
     * @return
     */
    Supplier selectById(Integer id);
    /**
     * 根据名称模糊查询
     * @param name
     * @return
     */
    List<Supplier> selectByName(String name);

    /**
     * 根据电话1模糊查询
     * @param phone
     * @return
     */
    List<Supplier> selectByPhone(String phone);

    /**
     * 根据电话2模糊查询
     * @param phones
     * @return
     */
    List<Supplier> selectByPhones(String phones);

    /**
     * 查询所有
     * @return
     */
    List<Supplier> selectAll();

    /**
     * 修改客户
     * @param supplier
     * @return
     */
    Supplier updateSupplier(Supplier supplier);

    /**
     * 创建客户
     * @param supplier
     * @return
     */
    Integer insertSupplier(Supplier supplier);

    /**
     * 删除客户
     * @param supplier
     * @return
     */
    void deleteSupplier(Supplier supplier);
}
