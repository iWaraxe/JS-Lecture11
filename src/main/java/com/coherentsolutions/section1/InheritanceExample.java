package com.coherentsolutions.section1;

// InheritanceExample.java

class Animal {
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    // Overriding the makeSound method from Animal class
    void makeSound() {
        System.out.println("Dog barks");
    }
}

public class InheritanceExample {
    public static void main(String[] args) {
        Animal myAnimal = new Animal();  // Create an Animal object
        Animal myDog = new Dog();        // Create a Dog object using polymorphism

        myAnimal.makeSound();  // Output: Animal makes a sound
        myDog.makeSound();     // Output: Dog barks

        // As you can see, the method makeSound is reused and adapted across different classes.
    }
}
