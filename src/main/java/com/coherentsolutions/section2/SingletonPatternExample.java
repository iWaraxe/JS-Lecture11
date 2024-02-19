package com.coherentsolutions.section2;

// SingletonPatternExample.java

public class SingletonPatternExample {
    public static void main(String[] args) {
        // In this lecture section, we'll discuss the Singleton Pattern.
        // - Definition and use cases.
        // - How to implement in Java.
        // - Advantages and Disadvantages.

        // Code demonstration: Creating Singleton instances
        Store firstInstance = Store.getInstance();
        Store secondInstance = Store.getInstance();

        // These references should be equal, indicating they point to the same object
        System.out.println(firstInstance);
        System.out.println(secondInstance);
        System.out.println(firstInstance == secondInstance);  // Output: true
    }
}

// Implementing a Singleton class in Java
class Store {
    // Step 1: Declare a private static instance of the same class
    private static Store instance;

    // Step 2: Private constructor to prevent instantiation
    private Store() {}

    // Step 3: Public method to return the singleton instance
    public static Store getInstance() {
        if (instance == null) {
            instance = new Store();
        }
        return instance;
    }
}

/**
 * Definition of Singleton Pattern:
 * - Ensures a class has only one instance.
 * - Provides a global point to access that instance.
 *
 * Common Use Cases:
 * - Logging
 * - Database connections
 * - Caching
 *
 * Advantages of Singleton Pattern:
 * - Ensures only one instance exists.
 * - Provides a global point of access.
 *
 * Disadvantages of Singleton Pattern:
 * - Can lead to global state.
 * - May complicate unit testing.
 */
