package com.showfloor.floor_books.service.impl;

import com.showfloor.floor_books.dao.BrandRepository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class BrandServiceImpl {

    @Resource
    private BrandRepository brandRepository;
}