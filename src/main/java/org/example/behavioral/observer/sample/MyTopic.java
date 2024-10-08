package org.example.behavioral.observer.sample;

import java.util.ArrayList;
import java.util.List;

public class MyTopic implements Subject{

    private List<Observer> observers;
    private String message;
    private boolean changed;

    public MyTopic() {
        this.observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer o) {
        if (o == null){
            throw new NullPointerException("Observer is null");
        }
        if (!observers.contains(o)){
            observers.add(o);
        }
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        if (changed) {
            observers.forEach(Observer::update);
        }
        changed = false;
    }

    @Override
    public Object getUpdate(Observer observer) {
        return this.message;
    }

    @Override
    public void postMessage(String message) {
        System.out.println("message posted to Topic :"+message);
        this.message = message;
        this.changed = true;
        notifyObservers();
    }
}
