package com.ldl.service;

import com.ldl.dao.IProductDao;
import com.ldl.domain.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IProductService {

    @Autowired
    IProductDao productDao;

    public List<Product> findAll(){
        return productDao.findAll();
    }
}
