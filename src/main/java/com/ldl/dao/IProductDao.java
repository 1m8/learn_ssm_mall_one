package com.ldl.dao;

import com.ldl.domain.Product;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface IProductDao {

    List<Product> findAll();

    void save(Product product);
}
