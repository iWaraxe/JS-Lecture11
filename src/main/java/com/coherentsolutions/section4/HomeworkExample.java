package com.coherentsolutions.section4;

// HomeworkExample.java

/**
 * Homework Assignment:
 * 1. Implement a Singleton class for managing configuration settings.
 * 2. Implement a Factory Method for creating different shapes.
 */

public class HomeworkExample {
    public static void main(String[] args) {
        // Test your Singleton and Factory Method implementations here.
    }
}

// Skeleton for Singleton class (Configuration Manager)
class ConfigurationManager {
    // Your code here for Singleton implementation
    private String settingA;
    private String settingB;

    // Add more settings and their getters as needed
}


// Skeleton for Factory Method (Shape Factory)
interface Shape {
    void draw();
}

class Circle implements Shape {
    public void draw() {
        // Implement drawing logic for circle
    }
}

class Square implements Shape {
    public void draw() {
        // Implement drawing logic for square
    }
}

class ShapeFactory {
    // Your code here for the Factory Method
}
