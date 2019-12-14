package com.showfloor.floor_books.service.impl;

import com.showfloor.floor_books.dao.ProductRepository;
import com.showfloor.floor_books.pojo.Product;
import com.showfloor.floor_books.service.ProductService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Resource
    private ProductRepository productRepository;

    @Override
    public List<Product> selectAll() {
        return productRepository.findAll();
    }

    @Override
    public List<Product> selectByBrand(String brand) {
        String newBrand = "%"+brand+"%";
        return productRepository.findByBrandLike(newBrand);
    }

    @Override
    public List<Product> selectByName(String name) {
        String newName = "%"+name+"%";
        return productRepository.findByNameLike(newName);
    }

    @Override
    public Product updateProduct(Product product) {
        Product old = productRepository.findById(product.getId()).get();
        if(product.getName()==null || "".equals(product.getName())){
            product.setName(old.getName());
        }
        if(product.getSide()==null || "".equals(product.getSide())){
            product.setSide(old.getSide());
        }
        if(product.getWide()==null || "".equals(product.getWide())){
            product.setWide(old.getWide());
        }
        if(product.getSpecifications()==null || "".equals(product.getSpecifications())){
            product.setSpecifications(old.getSpecifications());
        }
        if(product.getPurchasePrice()==null || "".equals(product.getPurchasePrice())){
            product.setPurchasePrice(old.getPurchasePrice());
        }
        if(product.getPrice()==null || "".equals(product.getPrice())){
            product.setPrice(old.getPrice());
        }
        if(product.getNumberOfPieces()==null || "".equals(product.getNumberOfPieces())){
            product.setNumberOfPieces(old.getNumberOfPieces());
        }
        if(product.getBrand()==null || "".equals(product.getBrand())){
            product.setBrand(old.getBrand());
        }
        product.setCreateTime(old.getCreateTime());
        return productRepository.save(product);
    }

    @Override
    public void deleteProduct(Product product) {
        productRepository.delete(product);
    }

    @Override
    public Product insertProduct(Product product) {
        product.setCreateTime(new Date());
        return productRepository.save(product);
    }
}
