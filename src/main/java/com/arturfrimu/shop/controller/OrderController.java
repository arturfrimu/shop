package com.arturfrimu.shop.controller;

import com.arturfrimu.shop.entity.Order;
import com.arturfrimu.shop.entity.OrderItem;
import com.arturfrimu.shop.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/orders")
public class OrderController {

    private final OrderService orderService;

    @GetMapping("/{id}")
    public OrderItem getOrderItem(@PathVariable int id) {
        return orderService.getOrderItem(id);
    }

    @PostMapping
    public void addOrderItem(@RequestBody OrderItem order) {
        orderService.addOrderItem(order);
    }

}
