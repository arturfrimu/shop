package com.arturfrimu.shop.repository;

import com.arturfrimu.shop.entity.Order;
import com.arturfrimu.shop.entity.OrderItem;
import org.springframework.stereotype.Repository;

@Repository
public class OrderRepository {

    public Order order = new Order();

    public OrderItem getById(int id) {
        return order.getOrderItem(id);
    }

    public void addOrderItem(OrderItem order) {
        this.order.addOrderItem(order);
    }
}
