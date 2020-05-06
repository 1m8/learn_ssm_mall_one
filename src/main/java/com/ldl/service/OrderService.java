package com.ldl.service;

import com.ldl.dao.IOrderDao;
import com.ldl.domain.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class OrderService {

    @Autowired
    IOrderDao orderDao;

    public List<Order> findAll(){
        return orderDao.findAll();
    }

    public Order findById(int id){
        return orderDao.findById(id);
    }

}
