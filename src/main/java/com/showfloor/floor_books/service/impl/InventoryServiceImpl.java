package com.showfloor.floor_books.service.impl;

import com.showfloor.floor_books.dao.InventoryRepository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class InventoryServiceImpl {

    @Resource
    private InventoryRepository inventoryRepository;
}
