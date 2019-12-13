package com.showfloor.floor_books.service.impl;

import com.showfloor.floor_books.dao.SupplierRepository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class SupplierServiceImpl {

    @Resource
    private SupplierRepository supplierRepository;
}
