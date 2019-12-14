package com.showfloor.floor_books.service;

import com.showfloor.floor_books.pojo.Product;

import java.util.List;

public interface ProductService {

    /**
     * 查询所有
     * @return
     */
    List<Product> selectAll();

    /**
     * 根据品牌查询
     * @param brand
     * @return
     */
    List<Product> selectByBrand(String brand);

    /**
     * 根据名称模糊查询
     * @param name
     * @return
     */
    List<Product> selectByName(String name);

    /**
     * 修改商品
     * @param product
     * @return
     */
    Product updateProduct(Product product);

    /**
     * 删除商品
     * @param product
     * @return
     */
    void deleteProduct(Product product);

    /**
     * 新增商品
     * @param product
     * @return
     */
    Product insertProduct(Product product);
}
