package org.example.behavioral.observer.sample;

public interface Subject {

    void registerObserver(Observer o);
    void removeObserver(Observer o);

    void notifyObservers();

    Object getUpdate(Observer observer);
    void postMessage(String message);
}
