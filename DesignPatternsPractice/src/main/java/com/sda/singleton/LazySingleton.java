package com.sda.singleton;

public class LazySingleton {

    private static LazySingleton instance;

    private LazySingleton() {
    }

    public static LazySingleton getInstance() {
        if (instance == null) {
            instance = new LazySingleton();
            System.out.println("Lazily created singleton instance.");
        }
        return instance;
    }

}
