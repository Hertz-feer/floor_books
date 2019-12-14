package com.showfloor.floor_books.controller;

import com.showfloor.floor_books.service.SupplierService;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;

@Controller
public class SupplierController {

    @Resource
    private SupplierService supplierServiceImpl;
}
