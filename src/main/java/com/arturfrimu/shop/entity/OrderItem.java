package com.arturfrimu.shop.entity;

public class OrderItem {
    private int id;
    private int count;
    private Product product;

    public OrderItem(int id, int count, Product product) {
        this.id = id;
        this.count = count;
        this.product = product;
    }

    public void decrementProductCount() {
        this.count--;
    }

    public void incrementProductCount() {
        this.count++;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    @Override
    public String toString() {
        return "OrderItem{" +
                "id=" + id +
                ", count=" + count +
                ", product=" + product +
                '}';
    }
}




