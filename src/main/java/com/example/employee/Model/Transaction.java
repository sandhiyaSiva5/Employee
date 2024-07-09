package com.example.employee.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity

public class Transaction {
    @Id
    @GeneratedValue

    private long TransactionId;
    private  long OrderId;
    private  int TransactionNumber;
    private  String status;
    private  int OrderDate;
    private  int DeliveryDate;

    public Transaction(){

    }
    public Transaction(long transactionId, long orderId, int transactionNumber, String status, int orderDate, int deliveryDate){
        this.TransactionId=transactionId;
        this.OrderId=orderId;
        this.TransactionNumber=transactionNumber;
        this.status=status;
        this.OrderDate=orderDate;
        this.DeliveryDate=deliveryDate;
    }

    public long getTransactionId() {
        return TransactionId;
    }

    public void setTransactionId(long transactionId) {
        TransactionId = transactionId;
    }

    public long getOrderId() {
        return OrderId;
    }

    public void setOrderId(long orderId) {
        OrderId = orderId;
    }

    public int getTransactionNumber() {
        return TransactionNumber;
    }

    public void setTransactionNumber(int transactionNumber) {
        TransactionNumber = transactionNumber;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
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
