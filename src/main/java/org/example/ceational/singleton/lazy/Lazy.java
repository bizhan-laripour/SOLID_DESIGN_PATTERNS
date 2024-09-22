package org.example.ceational.singleton.lazy;

public class Lazy {

    private static Lazy instance;

    private Lazy() {

    }

    public static Lazy getInstance() {
        if (instance == null) {
            instance = new Lazy();
        }
        return instance;
    }
}
