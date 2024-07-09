package com.example.employee.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity

public class Product {
    @Id
    @GeneratedValue

    private long productId;
    private String ProductName;
    private String ProductColour;
    private String category;
    private int budget;
    private int size;
    private String image;
    private String TotalQuality;
    private  int productCount  ;
    private  int rating;
    private  int discount;
    private  String fabric;
    private  String occasion;
    private  String brand;


    public Product(){

    }
    public Product(long productId, String productName, String productColour, String category, int budget, int size, String image, String totalQuality, int  productCount, int rating, int discount, String fabric, String occasion, String brand){

        this.productId= productId;
        this.ProductName= productName;
        this.ProductColour=productColour;
        this.category= category;
        this.budget=budget;
        this.size=size;
        this.image=image;
        this.TotalQuality=totalQuality;
        this.productCount=productCount;
        this.rating=rating;
        this.discount=discount;
        this.fabric=fabric;
        this.occasion=occasion;
        this.brand=brand;

    }

    public long getProductId() {
        return productId;
    }

    public void setProductId(long productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return ProductName;
    }

    public void setProductName(String productName) {
        ProductName = productName;
    }

    public String getProductColour() {
        return ProductColour;
    }

    public void setProductColour(String productColour) {
        ProductColour = productColour;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getBudget() {
        return budget;
    }

    public void setBudget(int budget) {
        this.budget = budget;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getTotalQuality() {
        return TotalQuality;
    }

    public void setTotalQuality(String totalQuality) {
        TotalQuality = totalQuality;
    }

    public int getProductCount() {
        return productCount;
    }

    public void setProductCount(int productCount) {
        this.productCount = productCount;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    public String getFabric() {
        return fabric;
    }

    public void setFabric(String fabric) {
        this.fabric = fabric;
    }

    public String getOccasion() {
        return occasion;
    }

    public void setOccasion(String occasion) {
        this.occasion = occasion;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
