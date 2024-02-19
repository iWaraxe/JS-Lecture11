package com.coherentsolutions.section3.example3;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class FactoryMethodWithReflectionExample {
    public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        AnimalFactoryWithReflection factory = new AnimalFactoryWithReflection();

        Animal myDog = factory.createAnimal("Dog");
        Animal myCat = factory.createAnimal("Cat");

        myDog.speak();  // Output: Dog barks
        myCat.speak();  // Output: Cat meows
    }
}

interface Animal {
    void speak();
}

class Dog implements Animal {
    public void speak() {
        System.out.println("Dog barks");
    }
}

class Cat implements Animal {
    public void speak() {
        System.out.println("Cat meows");
    }
}

class AnimalFactoryWithReflection {
    public Animal createAnimal(String animalType) {
        try {
            Class<?> clazz = Class.forName("com.coherentsolutions.section3.example3." + animalType);
            Constructor<?> constructor = clazz.getDeclaredConstructor();
            return (Animal) constructor.newInstance();
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException |
                 InvocationTargetException | NoSuchMethodException e) {
            throw new RuntimeException("Failed to create an animal of type " + animalType, e);
        }
    }

}
