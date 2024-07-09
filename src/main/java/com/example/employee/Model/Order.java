package com.example.employee.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="orders")
public class Order {
    @Id
    @GeneratedValue

    private long OrderId;
    private long UserId;
    private  long ProductId;
    private  String quality;
    private  int price;
    private  int OrderDate;
    private int DeliveryDate;

    public Order(){

    }
    public Order(long OrderId, long UserId, long ProductId, String quality, int price, int orderDate, int deliveryDate){
        this.UserId=UserId;
        this.OrderId=OrderId;
        this.ProductId=ProductId;
        this.quality=quality;
        this.price=price;
        this.OrderDate=orderDate;
        this.DeliveryDate=deliveryDate;
    }

    public long getOrderId() {
        return OrderId;
    }

    public void setOrderId(long orderId) {
        OrderId = orderId;
    }

    public long getUserId() {
        return UserId;
    }

    public void setUserId(long userId) {
        UserId = userId;
    }

    public long getProductId() {
        return ProductId;
    }

    public void setProductId(long productId) {
        ProductId = productId;
    }

    public String getQuality() {
        return quality;
    }

    public void setQuality(String quality) {
        this.quality = quality;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getOrderDate() {
        return OrderDate;
    }

    public void setOrderDate(int orderDate) {
        OrderDate = orderDate;
    }

    public int getDeliveryDate() {
        return DeliveryDate;
    }

    public void setDeliveryDate(int deliveryDate) {
        DeliveryDate = deliveryDate;
    }
}
