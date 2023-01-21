package com.example.demo.controller;

import com.example.demo.model.DeliveryType;
import com.example.demo.model.Order;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/orders")
public class OrderMvcController {

    @GetMapping("/new")
    public String createForm(@ModelAttribute("order") Order order) {
        //model.addAttribute("order", new Order());
        return "orders/new";
    }

    @PostMapping
    public String create(@ModelAttribute("order") Order order) {

        System.out.println(order);
        return "redirect:/orders/new";
    }

}
