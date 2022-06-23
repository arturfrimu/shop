package com.arturfrimu.shop.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class Order {
    private List<OrderItem> orderItems;

    public OrderItem getOrderItem(int orderItemId) {
        if (this.orderItems == null) {
            this.orderItems = new ArrayList<>();
        }
        return orderItems.stream().filter(orderItem -> orderItemId == orderItem.getId()).findFirst().orElse(null);
    }

    public void addOrderItem(OrderItem orderItem) {
        if (this.orderItems == null) {
            this.orderItems = new ArrayList<>();
        }
        orderItems.add(orderItem);
    }

    public void removeOrderItem(int orderItemId) {
        orderItems.remove(orderItemId);
    }

    public void addProduct(int orderItemId) {
        if (this.orderItems == null) {
            return;
        }
        OrderItem orderItem = this.orderItems.stream()
                .filter(o -> o.getId() == orderItemId)
                .findFirst().orElseThrow(() -> new NoSuchElementException("Not found order item with id " + orderItemId));
        orderItem.decrementProductCount();
    }

    public void removeOneProduct(int orderItemId) {
        OrderItem orderItem = this.orderItems.stream()
                .filter(o -> o.getId() == orderItemId)
                .findFirst().orElseThrow(() -> new NoSuchElementException("Not found order item with id " + orderItemId));
        orderItem.incrementProductCount();
    }

    public List<OrderItem> getOrderItems() {
        return orderItems;
    }

    public void setOrderItems(List<OrderItem> orderItems) {
        this.orderItems = orderItems;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderItems=" + orderItems +
                '}';
    }
}
