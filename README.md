# Product Management System - Java

##  Project Description

This project was developed to demonstrate the implementation of a Java class using Object-Oriented Programming (OOP) principles.

The system models a real-world entity called **Product**, including attributes, constructors, encapsulation, validation logic, and method overriding.

The program is executed through a `Main` class, where Product objects are created and manipulated.

---

##  Class: Product

### Attributes

The `Product` class contains the following private attributes:

- `id` (String) → Product identifier
- `name` (String) → Product name
- `price` (double) → Product price
- `stock` (int) → Available quantity in inventory

---

##  Constructors

### 1️ Default Constructor
Initializes attributes with default values:
- id → "N/A"
- name → "Unknown"
- price → 0.0
- stock → 0

### 2️ Parameterized Constructor
Allows initializing all attributes when creating a new Product object.

---

## Methods Implemented

- Getters for all attributes
- Setters with validation:
  - ID and Name cannot be null or empty
  - Price cannot be negative
  - Stock cannot be negative
- Overridden `toString()` method to display formatted product information

---

##  Program Execution (Main Class)

In the `Main` class:

- A Product object is created using the default constructor.
- Attributes are set using setter methods.
- Another Product object is created using the parameterized constructor.
- Getter methods are used to display specific information.
- The `toString()` method is used to print complete product details.

---

## ▶️ How to Compile and Run

### Compile:
```
javac com/example/*.java
```

### Run:
```
java com.example.Main
```

---

##  Example Output

```
Product 1 Name: Laptop
Product 2 Price: $499.99

Full Product Information:
Product [ID: P001, Name: Laptop, Price: 949.99, Stock: 8]
Product [ID: P002, Name: Smartphone, Price: 499.99, Stock: 20]
```

---

## 🛠 Technologies Used

- Java
- Visual Studio Code
- Git & GitHub

---

##  Author