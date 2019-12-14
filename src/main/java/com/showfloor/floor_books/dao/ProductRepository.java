package com.showfloor.floor_books.dao;

import com.showfloor.floor_books.pojo.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product,Integer> {

    List<Product> findByBrandLike(String brand);

    List<Product> findByNameLike(String name);
}
