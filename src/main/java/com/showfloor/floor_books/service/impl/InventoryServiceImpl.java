package com.showfloor.floor_books.service.impl;
/**
 * 地板库存表
 */

import com.showfloor.floor_books.dao.InventoryRepository;
import com.showfloor.floor_books.pojo.Inventory;
import com.showfloor.floor_books.service.InventoryService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

@Service
public class InventoryServiceImpl implements InventoryService {

    @Resource
    private InventoryRepository inventoryRepository;


    @Override
    public List<Inventory> selectByName(String name) {
        String newName = "%"+name+"%";
        return inventoryRepository.findByNameLike(newName);
    }

    @Override
    public List<Inventory> selectAll() {
        return inventoryRepository.findAll();
    }

    @Override
    public List<Inventory> selectByBrand(String brand) {
        String newBrand = "%"+brand+"%";
        return inventoryRepository.findByBrandLike(newBrand);
    }

    @Override
    public Inventory updateInventory(Inventory inventory) {
        Inventory old = inventoryRepository.findById(inventory.getId()).get();
        if(inventory.getBrand()==null || "".equals(inventory.getBrand())){
            inventory.setBrand(old.getBrand());
        }
        if(inventory.getName()==null || "".equals(inventory.getName())){
            inventory.setName(old.getName());
        }
        if(inventory.getPiece()==null || "".equals(inventory.getPiece())){
            inventory.setPiece(old.getPiece());
        }
        if(inventory.getSlice()==null || "".equals(inventory.getSlice())){
            inventory.setSlice(old.getSlice());
        }
        inventory.setLastUpdate(new Date());
        return inventoryRepository.save(inventory);
    }

    @Override
    public void deleteInventory(Integer id) {
        inventoryRepository.deleteById(id);
    }

    @Override
    public Inventory selectById(Integer id) {
        return inventoryRepository.findById(id).get();
    }

    @Override
    public Inventory InsertInventory(Inventory inventory) {
        inventory.setLastUpdate(new Date());
        return inventoryRepository.save(inventory);
    }
}
