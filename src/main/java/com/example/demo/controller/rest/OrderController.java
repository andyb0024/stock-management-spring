package com.example.demo.controller.rest;

import com.example.demo.model.Customer;
import com.example.demo.model.Order;
import com.example.demo.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OrderController {
    @Autowired
    private OrderService orderService;
    @PostMapping("/api/order/add")
    public Order addOrder(@RequestBody Order order){
        return orderService.saveOrder(order);
    }
    @GetMapping("/api/order")
    public List<Order> orderList(){
        return orderService.OrderLists();
    }
}
