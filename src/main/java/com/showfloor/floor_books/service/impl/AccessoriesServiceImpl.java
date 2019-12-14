package com.showfloor.floor_books.service.impl;

import com.showfloor.floor_books.dao.AccessoriesRepository;
import com.showfloor.floor_books.pojo.Accessories;
import com.showfloor.floor_books.service.AccessoriesService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class AccessoriesServiceImpl implements AccessoriesService {

    @Resource
    private AccessoriesRepository accessoriesRepository;

    @Override
    public List<Accessories> getAll() {
        return  accessoriesRepository.findAll();
    }

    @Override
    public List<Accessories> selectByName(String name) {
        String newName = "%"+name+"%";
        return accessoriesRepository.findByNameLike(newName);
    }

    @Override
    public List<Accessories> selectByBrand(String brand) {
        String newBrand = "%"+brand+"%";
        return accessoriesRepository.findByBrandLike(newBrand);
    }

    @Override
    public Accessories createAccessories(Accessories accessories) {
        Accessories create = accessoriesRepository.save(accessories);
        return create;
    }

    @Override
    public void deleteAccessories(Integer id) {
        accessoriesRepository.deleteById(id);
    }

    @Override
    public Accessories updateAccessories(Accessories accessories) {
        Accessories old = accessoriesRepository.findById(accessories.getId()).get();
        if(accessories.getName()==null || "".equals(accessories.getName())){
            accessories.setName(old.getName());
        }
        if(accessories.getBrand()==null || "".equals(accessories.getBrand())){
            accessories.setBrand(old.getBrand());
        }
        if(accessories.getPrice()==null || "".equals(accessories.getPrice())){
            accessories.setPrice(old.getPrice());
        }
        if(accessories.getPurchasePrice()==null || "".equals(accessories.getPurchasePrice())){
            accessories.setPurchasePrice(old.getPurchasePrice());
        }
        accessories.setCreateTIme(old.getCreateTime());
        return accessoriesRepository.save(accessories);

    }

    @Override
    public Accessories selectById(Integer id) {
        return accessoriesRepository.findById(id).get();
    }
}
