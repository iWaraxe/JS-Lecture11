package com.coherentsolutions.section3.example2;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class FactoryMethodWithMapExample {
    public static void main(String[] args) {
        AnimalFactoryWithMap factory = new AnimalFactoryWithMap();

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

class AnimalFactoryWithMap {
    private Map<String, Supplier<Animal>> map = new HashMap<>();

    public AnimalFactoryWithMap() {
        map.put("Dog", () -> new Dog());
        map.put("Cat", Cat::new);
    }

    public Animal createAnimal(String animalType) {
        Supplier<Animal> supplier = map.get(animalType);
        return supplier != null ? supplier.get() : null;
    }
}
