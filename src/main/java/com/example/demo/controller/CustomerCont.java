package com.example.demo.controller;

import com.example.demo.model.Customer;
import com.example.demo.model.Product;
import com.example.demo.service.CustomerService;
import com.example.demo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
@Controller
public class CustomerCont {
    @Autowired
    private CustomerService customerService;


    @GetMapping("/customers")
    public String customerList(Model model) {
     List<Customer> customerList=customerService.customerList();
     model.addAttribute("customerList", customerList);
        return "customer/customer-list";
    }
}
