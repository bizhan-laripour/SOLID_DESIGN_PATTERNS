package org.example.behavioral.observer.sample2;

import java.util.ArrayList;
import java.util.List;

public class MySubject implements Subject{

    private List<Observer> observers;
    private String topicName;
    private String message;

    public MySubject(String topicName, String message) {
        this.topicName = topicName;
        this.message = message;
        this.observers = new ArrayList<>();
    }

    @Override
    public void register(Observer o) {
        this.observers.add(o);
    }

    @Override
    public void unregister(Observer o) {
        this.observers.remove(o);
    }



    @Override
    public void notifyObservers() {
        observers.forEach(obj -> obj.invoke(message));
    }

    @Override
    public String update(String message) {
        this.message = message;
        notifyObservers();
        return this.message;
    }
}
