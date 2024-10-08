package org.example.behavioral.memento.state;

import java.util.ArrayList;
import java.util.List;

public class CareTaker {

    private List<Memento> mementos;

    public CareTaker() {
        this.mementos = new ArrayList<>();
    }

    public void addMemento(Memento memento) {
        this.mementos.add(memento);
    }

    public Memento getMemento(int index) {
        return this.mementos.get(index);
    }
}
