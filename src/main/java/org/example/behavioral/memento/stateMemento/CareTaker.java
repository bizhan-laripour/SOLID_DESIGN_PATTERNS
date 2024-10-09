package org.example.behavioral.memento.stateMemento;

import java.util.ArrayList;
import java.util.List;

public class CareTaker {

    private List<Memento> mementos;

    public CareTaker() {
        mementos = new ArrayList<>();
    }

    public void addMemento(Memento memento) {
        mementos.add(memento);
    }

    public Memento getMemento(int index) {
        return mementos.get(index);
    }
}
