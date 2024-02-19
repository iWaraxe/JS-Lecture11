package com.coherentsolutions.section2;

// EagerInitializationSingleton.java

public class EagerInitializationSingleton {
    private static final EagerInitializationSingleton INSTANCE = new EagerInitializationSingleton();

    private EagerInitializationSingleton() {}

    public static EagerInitializationSingleton getInstance() {
        return INSTANCE;
    }
}
