package com.showfloor.floor_books.controller;

import com.showfloor.floor_books.service.InventoryService;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;

@Controller
public class InventoryController {

    @Resource
    private InventoryService inventoryServiceImpl;
}
