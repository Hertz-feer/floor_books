package com.showfloor.floor_books.dao;

import com.showfloor.floor_books.pojo.Inventory;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface InventoryRepository extends JpaRepository<Inventory,Integer> {

    List<Inventory> findByNameLike(String name);

    List<Inventory> findByBrandLike(String brand);
}
