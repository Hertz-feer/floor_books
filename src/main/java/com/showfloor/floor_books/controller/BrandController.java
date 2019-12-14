package com.showfloor.floor_books.controller;

import com.showfloor.floor_books.service.BrandService;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;

@Controller
public class BrandController {

    @Resource
    private BrandService brandServiceImpl;
}
