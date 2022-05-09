package com.example.demo.service;

import com.example.demo.model.Customer;
import com.example.demo.model.Product;
import com.example.demo.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class CustomerService {
    @Autowired
    private CustomerRepository customerRepository;

    public Customer saveCustomer(Customer customer){
        return customerRepository.save(customer);
    }
    public List<Customer> customerList(){
        return customerRepository.findAll();
    }
    public Customer getCustomerById(int id){
        return customerRepository.findById(id).orElse(null);

    }

    public Customer updateCustomer(Customer customer){
        Customer getCustomerId = customerRepository.findById(customer.getCid()).orElse(null);
        assert getCustomerId != null;
        getCustomerId.setCname(customer.getCname());
        getCustomerId.setPhone(customer.getPhone());
        return customerRepository.save(getCustomerId);

    }

    public String deleteCustomer(int id){
        customerRepository.deleteById(id);
        return "product removed !! " + id;

    }



}
