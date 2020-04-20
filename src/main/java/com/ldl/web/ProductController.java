package com.ldl.web;

import com.ldl.domain.Product;
import com.ldl.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping(path="/product")
public class ProductController {

    @Autowired
    private IProductService productService;

    @RequestMapping(path="/findAll.do")
    public String findAll(){
        List<Product> products = productService.findAll();
        System.out.println(products);
        return "success";
    }
}
