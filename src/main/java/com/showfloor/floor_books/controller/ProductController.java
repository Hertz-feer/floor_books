package com.showfloor.floor_books.controller;

import com.showfloor.floor_books.service.ProductService;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;

@Controller
public class ProductController {

    @Resource
    private ProductService productServiceImpl;
}
