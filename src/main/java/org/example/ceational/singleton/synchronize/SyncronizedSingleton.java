package org.example.ceational.singleton.synchronize;

public class SyncronizedSingleton {

    private static SyncronizedSingleton instance;


    private SyncronizedSingleton() {

    }

    public static synchronized SyncronizedSingleton getInstance() {
        if (instance == null) {
            instance = new SyncronizedSingleton();
        }
        return instance;
    }
}
