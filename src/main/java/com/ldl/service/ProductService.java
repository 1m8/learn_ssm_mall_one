package com.ldl.service;

import com.ldl.dao.IProductDao;
import com.ldl.domain.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class ProductService {

    @Autowired
    IProductDao productDao;

    public List<Product> findAll(){
        return productDao.findAll();
    }

    public void save(Product product){
        productDao.save(product);
    }

    public void deleteById(int id){
        productDao.deleteById(id);
    }


}
