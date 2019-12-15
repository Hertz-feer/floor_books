package com.showfloor.floor_books.service.impl;

import com.showfloor.floor_books.dao.SupplierRepository;
import com.showfloor.floor_books.pojo.Supplier;
import com.showfloor.floor_books.service.SupplierService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class SupplierServiceImpl implements SupplierService {

    @Resource
    private SupplierRepository supplierRepository;

    @Override
    public List<Supplier> selectByName(String name) {
        String newName = "%"+name+"%";
        return supplierRepository.findByNameLike(newName);
    }

    @Override
    public List<Supplier> selectByPhone(String phone) {
        String newPhone = "%"+phone+"%";
        return  supplierRepository.findByPhoneNumberLike(newPhone);
    }

    @Override
    public List<Supplier> selectByPhones(String phones) {
        String newPhones = "%"+phones+"%";
        return  supplierRepository.findByPhoneNumbersLike(newPhones);
    }

    @Override
    public List<Supplier> selectAll() {
        return supplierRepository.findAll();
    }

    @Override
    public Supplier updateSupplier(Supplier supplier) {
        Supplier old = supplierRepository.findById(supplier.getId()).get();
        if(supplier.getAddress()==null || "".equals(supplier.getAddress())){
            supplier.setAddress(old.getAddress());
        }
        if(supplier.getName()==null || "".equals(supplier.getName())){
            supplier.setName(old.getName());
        }
        if(supplier.getPhoneNumber()==null || "".equals(supplier.getPhoneNumber())){
            supplier.setPhoneNumber(old.getPhoneNumber());
        }
        if(supplier.getPhoneNumbers()==null || "".equals(supplier.getPhoneNumbers())){
            supplier.setPhoneNumbers(old.getPhoneNumbers());
        }
        supplier.setCreateTime(old.getCreateTime());
        return supplierRepository.save(supplier);
    }

    @Override
    public Supplier selectById(Integer id) {
        return supplierRepository.findById(id).get();
    }

    @Override
    public Integer insertSupplier(Supplier supplier) {
        return null;
    }

    @Override
    public void deleteSupplier(Supplier supplier) {
        supplierRepository.delete(supplier);
    }
}
