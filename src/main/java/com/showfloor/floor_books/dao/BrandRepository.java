package com.showfloor.floor_books.dao;

import com.showfloor.floor_books.pojo.Brand;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BrandRepository extends JpaRepository<Brand,Integer> {

    Brand findByNameLike(String name);

}
