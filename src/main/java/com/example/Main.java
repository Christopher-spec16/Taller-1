package com.example;

public class Main {
    public static void main(String[] args) {
        Product product1 = new Product("P001", "Laptop", 999.99, 10);
        Product product2 = new Product("P002", "Smartphone", 499.99, 20);

        System.out.println("Product 1: " + product1.getName() + " - $" + product1.getPrice());
        System.out.println("Product 2: " + product2.getName() + " - $" + product2.getPrice());

        // Update stock and price
        product1.setStock(8);
        product1.setPrice(949.99);

        System.out.println("Updated Product 1: " + product1.getName() + " - $" + product1.getPrice() + ", Stock: " + product1.getStock());
    }
}