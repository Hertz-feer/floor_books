package com.showfloor.floor_books.dao;

import com.showfloor.floor_books.pojo.Inventory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InventoryRepository extends JpaRepository<Inventory,Integer> {

}
