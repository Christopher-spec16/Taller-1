package com.example;

public class Main {
    public static void main(String[] args) {
          Product product1 = new Product();

        product1.setId("P001");
        product1.setName("Laptop");
        product1.setPrice(999.99);
        product1.setStock(10);

        // constructor
        Product product2 = new Product("P002", "Smartphone", 499.99, 20);

        // getters
        System.out.println("Product 1 Name: " + product1.getName());
        System.out.println("Product 2 Price: $" + product2.getPrice());

        // product2
        product2.applyDiscount(10);

        product1.setStock(8);
        product1.setPrice(949.99);

        System.out.println("\nFull Product Information:");
        System.out.println(product1);
        System.out.println(product2);
    }
}