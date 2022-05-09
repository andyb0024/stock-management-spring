package com.example.demo.controller;

import com.example.demo.model.Product;
import com.example.demo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class ProductCont {
    @Autowired
    private ProductService productService;


    @GetMapping("/products")
    public String productList(Model model) {
        List<Product> productList = productService.getProductList();
        model.addAttribute("productList", productList);
        return "product/product-list";
    }
}
