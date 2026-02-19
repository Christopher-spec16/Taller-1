package com.example;

public class Product {

    private String id;
    private String name;
    private double price;
    private int stock;

    public Product() {
        this.id = "N/A";
        this.name = "Unknown";
        this.price = 0.0;
        this.stock = 0;
    }

    public Product(String id, String name, double price, int stock) {
        this.id = id;
        this.name = name;
        setPrice(price);   
        setStock(stock);   
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getStock() {
        return stock;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        if (price >= 0) {
            this.price = price;
        } else {
            System.out.println("Price cannot be negative.");
        }
    }

    public void setStock(int stock) {
        if (stock >= 0) {
            this.stock = stock;
        } else {
            System.out.println("Stock cannot be negative.");
        }
    }
    
    public String toString() {
        return "Product [ID: " + id + 
               ", Name: " + name + 
               ", Price: " + price + 
               ", Stock: " + stock + "]";
    }
}
