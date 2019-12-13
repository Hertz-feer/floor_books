package com.showfloor.floor_books;

import com.showfloor.floor_books.dao.AccessoriesRepository;
import com.showfloor.floor_books.dao.InventoryRepository;
import com.showfloor.floor_books.dao.ProductRepository;
import com.showfloor.floor_books.pojo.Accessories;
import com.showfloor.floor_books.pojo.Inventory;
import com.showfloor.floor_books.pojo.Product;
import com.showfloor.floor_books.service.AccessoriesService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.List;

@SpringBootTest
public class test {

    @Resource
    InventoryRepository inventoryRepository;
    @Resource
    AccessoriesService accessoriesServiceImpl;
    @Resource
    AccessoriesRepository accessoriesRepository;
    @Resource
    ProductRepository productRepository;

    @Test
    public void test01(){
        List<Accessories> d = accessoriesServiceImpl.selectByBrand("利");
        System.out.println(d);
    }

    @Test
    public void test02(){
        List<Inventory> d = inventoryRepository.findAll();
        System.out.println(d);
    }

    @Test
    public void test03(){
        List<Product> all = productRepository.findAll();
        System.out.println(all);
    }

    @Test
    public void test04(){
        Accessories accessories = new Accessories();
        accessories.setPrice(9.0);
        accessories.setPurchasePrice(7.0);
        accessories.setId(1);
        accessoriesServiceImpl.updateAccessories(accessories);
    }
}
