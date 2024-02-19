package com.coherentsolutions.section3.example1;

// FactoryMethodPatternExample.java

public class FactoryMethodPatternExample {
    public static void main(String[] args) {
        // In this lecture section, we'll discuss the Factory Method Pattern.
        // - Definition and use cases.
        // - How to implement in Java.
        // - Advantages and Disadvantages.

        // Code demonstration: Using Factory Method to create objects
        AnimalFactory factory = new AnimalFactory();

        Animal myDog = factory.createAnimal("Dog");
        Animal myCat = factory.createAnimal("Cat");

        myDog.speak();  // Output: Dog barks
        myCat.speak();  // Output: Cat meows
    }
}

// Animal interface
interface Animal {
    void speak();
}

// Dog class implementing Animal
class Dog implements Animal {
    public void speak() {
        System.out.println("Dog barks");
    }
}

// Cat class implementing Animal
class Cat implements Animal {
    public void speak() {
        System.out.println("Cat meows");
    }
}

// Factory Method implementation
class AnimalFactory {
    public Animal createAnimal(String type) {
        if ("Dog".equals(type)) {
            return new Dog();
        } else if ("Cat".equals(type)) {
            return new Cat();
        }
        return null;
    }
}

/**
 * Definition of Factory Method Pattern:
 * - Provides an interface for creating objects.
 * - Subclasses alter the type of objects to be created.
 *
 * Common Use Cases:
 * - GUI libraries
 * - Payment gateway integrations
 *
 * Advantages of Factory Method Pattern:
 * - Allows flexibility in object creation.
 * - Achieves loose coupling between client and concrete classes.
 *
 * Disadvantages of Factory Method Pattern:
 * - Can increase code complexity.
 * - Adds a level of indirection in object creation.
 */

