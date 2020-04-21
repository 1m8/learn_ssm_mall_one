package com.ldl.web;

import com.ldl.domain.Product;
import com.ldl.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping(path="/product")
public class ProductController {

    @Autowired
    private ProductService productService;

    @RequestMapping(path="/findAll.do")
    public ModelAndView findAll(){
        //新建ModelAndView对象
        ModelAndView modelAndView = new ModelAndView();
        List<Product> products = productService.findAll();
        modelAndView.addObject("products", products);
        modelAndView.setViewName("product/list");
        return modelAndView;
    }


    @RequestMapping(path="add.do", method = {RequestMethod.GET})
    public String add(){
        return "product/add";
    }

    /**
     * 产品提交
     */
    @RequestMapping(path="add.do", method = {RequestMethod.POST})
    public String save(Product product){
        productService.save(product);
        System.out.println(product);
        return "redirect:findAll.do";
    }



}
