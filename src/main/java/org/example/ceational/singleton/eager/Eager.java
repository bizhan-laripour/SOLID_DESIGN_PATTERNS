package org.example.ceational.singleton.eager;

public class Eager {
    private static Eager instance = new Eager();

    private Eager() {

    }
    public static Eager getInstance() {
        return instance;
    }
}
