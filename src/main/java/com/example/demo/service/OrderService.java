package com.example.demo.service;

import com.example.demo.model.Customer;
import com.example.demo.model.Order;
import com.example.demo.repository.OrderRepository;
import org.aspectj.weaver.ast.Or;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class OrderService {
    @Autowired
    private OrderRepository orderRepository;
    public Order saveOrder(Order order){
        order.setOrderDate(new Date());
       return orderRepository.save(order);
    }
    public List<Order>OrderLists(){
        return orderRepository.findAll();
    }
    public Order getOrderById(int id){
        return orderRepository.findById(id).orElse(null);

    }
//
//    public Order updateOrder(Order order){
//        Order getOrderId = orderRepository.findById(order.getOid()).orElse(null);
//        assert getCustomerId != null;
//        getCustomerId.setCname(customer.getCname());
//        getCustomerId.setPhone(customer.getPhone());
//        return orderRepository.save(getCustomerId);
//
//    }
//
//    public String deleteCustomer(int id){
//        customerRepository.deleteById(id);
//        return "product removed !! " + id;
//
//    }


}
