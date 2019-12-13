package com.showfloor.floor_books.service.impl;

import com.showfloor.floor_books.dao.ProductRepository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class ProductServiceImpl {

    @Resource
    private ProductRepository productRepository;
}
