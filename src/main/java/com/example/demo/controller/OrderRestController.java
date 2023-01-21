package com.example.demo.controller;

import com.example.demo.model.Order;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value= "/api/orders")
public class OrderRestController {

    @PostMapping
    public Order createOrder(@RequestBody Order order) {
        System.out.println(order);
        return order;
    }
}
