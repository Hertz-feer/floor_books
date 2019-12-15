package com.showfloor.floor_books.service.impl;
/**
 *  品牌表业务层
 */

import com.showfloor.floor_books.dao.BrandRepository;
import com.showfloor.floor_books.pojo.Brand;
import com.showfloor.floor_books.service.BrandService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class BrandServiceImpl implements BrandService {

    @Resource
    private BrandRepository brandRepository;

    @Override
    public List<Brand> selectAll() {
        return brandRepository.findAll();
    }

    @Override
    public Brand selectByName(String name) {
        String newName = "%"+name+"%";
        return brandRepository.findByNameLike(newName);
    }

    @Override
    public Brand selectById(Integer id) {
        return brandRepository.findById(id).get();
    }

    @Override
    public Brand insertBrand(Brand brand) {
        return brandRepository.save(brand);
    }

    @Override
    public void deleteBrand(Integer id) {
        brandRepository.deleteById(id);
    }

    @Override
    public Brand updateBrand(Brand brand) {
        return  brandRepository.save(brand);
    }
}
