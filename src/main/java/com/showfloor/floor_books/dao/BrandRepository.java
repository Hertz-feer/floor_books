package com.showfloor.floor_books.dao;

import com.showfloor.floor_books.pojo.Brand;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface BrandRepository extends JpaRepository<Brand,Integer>, JpaSpecificationExecutor<Brand> {
}
