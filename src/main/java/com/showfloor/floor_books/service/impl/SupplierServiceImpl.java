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
        return  supplierRepository.findByPhoneNumberAndPhoneNumber2Like(newPhone);
    }

    @Override
    public List<Supplier> selectByPhone2(String phone2) {
        String newPhone2 = "%"+phone2+"%";
        return  supplierRepository.findByPhoneNumberAndPhoneNumber2Like(newPhone2);
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
        if(supplier.getPhoneNumber2()==null || "".equals(supplier.getPhoneNumber2())){
            supplier.setPhoneNumber2(old.getPhoneNumber2());
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
