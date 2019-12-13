package com.showfloor.floor_books.dao;

import com.showfloor.floor_books.pojo.Accessories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.List;

public interface AccessoriesRepository extends JpaRepository<Accessories,Integer>, JpaSpecificationExecutor<Accessories> {

    List<Accessories> findByNameLike(String name);

    List<Accessories> findByBrandLike(String brand);
}
