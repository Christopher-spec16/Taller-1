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

    // constructor
    public Product(String id, String name, double price, int stock) {
        setId(id);
        setName(name);
        setPrice(price);
        setStock(stock);
    }

    // Getters
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

    // validation
    public void setId(String id) {
        if (id != null && !id.isEmpty()) {
            this.id = id;
        } else {
            System.out.println("Error: Invalid ID.");
        }
    }

    public void setName(String name) {
        if (name != null && !name.isEmpty()) {
            this.name = name;
        } else {
            System.out.println("Error: Invalid name.");
        }
    }

    public void setPrice(double price) {
        if (price >= 0) {
            this.price = price;
        } else {
            System.out.println("Error: Price cannot be negative.");
        }
    }

    public void setStock(int stock) {
        if (stock >= 0) {
            this.stock = stock;
        } else {
            System.out.println("Error: Stock cannot be negative.");
        }
    }

    public void applyDiscount(double percentage) {
        if (percentage > 0 && percentage <= 100) {
            price -= price * (percentage / 100);
        } else {
            System.out.println("Error: Invalid discount percentage.");
        }
    }

    public String toString() {
        return String.format(
                "Product [ID: %s, Name: %s, Price: %.2f, Stock: %d]",
                id, name, price, stock
        );
    }
}
