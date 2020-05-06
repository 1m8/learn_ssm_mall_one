package com.ldl.dao;

import com.ldl.domain.Order;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface IOrderDao {
    List<Order> findAll();
    Order findById(int id);

}
