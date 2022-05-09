package com.example.demo.controller.rest;

import com.example.demo.model.Customer;
import com.example.demo.model.Product;
import com.example.demo.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CustomerController {
    @Autowired
    private CustomerService customerService;

    @PostMapping("/customers/add")
    public Customer addCustomer(@RequestBody Customer customer) {
        return customerService.saveCustomer(customer);
    }
    @GetMapping("/api/customers")
    public List<Customer> getCustomerList(){
        return customerService.customerList();
    }
    @GetMapping("/customers/{id}")
    public Customer findCustomerById(@PathVariable int id) {
        return customerService.getCustomerById(id);
    }
    @PutMapping("/customer/update")
    public  Customer updateCustomer(@RequestBody Customer customer){
        return  customerService.updateCustomer(customer);
    }
    @DeleteMapping("customer/delete/{id}")
    public String deleteCustomer(@PathVariable int id) {
        return customerService.deleteCustomer(id);
    }

}
