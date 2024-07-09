package com.example.employee.Service;

import com.example.employee.Model.Order;
import com.example.employee.Repository.OrderRepository;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {
    @Autowired

    private OrderRepository orderRepository;

    public List<Order> getAllOrders() {
        return orderRepository.findAll();
    }

    public Optional<Order> getOrderById(long id) {
        return orderRepository.findById(id);
    }

    public Order createOrder(Order order) {
        return orderRepository.save(order);
    }

    public Order updateOrder(long id, Order orderDetails) {
        Optional<Order> optionalOrder = orderRepository.findById(id);
        if (optionalOrder.isPresent()) {
            Order order = optionalOrder.get();
            order.setUserId(orderDetails.getUserId());
            order.setProductId(orderDetails.getProductId());
            order.setQuality(orderDetails.getQuality());
            order.setPrice(orderDetails.getPrice());
            order.setOrderDate(orderDetails.getOrderDate());
            order.setDeliveryDate(orderDetails.getDeliveryDate());
            return orderRepository.save(order);
        } else {
            return null;
        }
    }

    public void deleteOrder(long id) {
        orderRepository.deleteById(id);
    }
}
