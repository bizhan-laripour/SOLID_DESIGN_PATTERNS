package org.example.behavioral.observer.sample2;

public interface Subject {

    void register(Observer o);
    void unregister(Observer o);
    void notifyObservers();
    String update(String message);
}
