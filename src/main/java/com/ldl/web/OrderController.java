package com.ldl.web;

import com.github.pagehelper.PageHelper;
import com.ldl.domain.Order;
import com.ldl.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping(path="/order")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @RequestMapping(path="/findAll.do")
    public ModelAndView findAll(@RequestParam(name="pageNo", defaultValue="1") Integer pageNo,
                                @RequestParam(name="pageSize", defaultValue = "1") Integer pageSize){
        //新建ModelAndView对象
        ModelAndView modelAndView = new ModelAndView();

        PageHelper.startPage(pageNo, pageSize);
        List<Order> orders = orderService.findAll();
        modelAndView.addObject("orders", orders);
        modelAndView.setViewName("order/list");
        return modelAndView;
    }

    @RequestMapping(path = "/detail.do", method = {RequestMethod.GET})
    public ModelAndView detail(@RequestParam(name="id") Integer id){
        ModelAndView modelAndView = new ModelAndView();
        Order order = orderService.findById(id);
        modelAndView.addObject("order", order);
        modelAndView.setViewName("order/detail");
        System.out.println(order);
        return modelAndView;
    }




}
