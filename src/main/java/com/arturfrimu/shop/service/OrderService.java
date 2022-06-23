package com.arturfrimu.shop.service;

import com.arturfrimu.shop.entity.OrderItem;
import com.arturfrimu.shop.repository.OrderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class OrderService {

    private final OrderRepository orderRepository;

    public OrderItem getOrderItem(int id) {
        return orderRepository.getById(id);
    }

    public void addOrderItem(OrderItem order) {
        orderRepository.addOrderItem(order);
    }
}
