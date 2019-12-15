package com.showfloor.floor_books.dao;

import com.showfloor.floor_books.pojo.Supplier;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SupplierRepository extends JpaRepository<Supplier,Integer> {

    List<Supplier> findByNameLike(String name);

    List<Supplier> findByPhoneNumberLike(String phoneNumber);

    List<Supplier> findByPhoneNumbersLike(String phoneNumbers);
}
