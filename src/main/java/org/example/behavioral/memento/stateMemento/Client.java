package org.example.behavioral.memento.stateMemento;

public class Client {

    public static void main(String[] args) {
        CareTaker careTaker = new CareTaker();
        Originator originator = new Originator();
        originator.setState("state 1");
        originator.setState("state 2");
        careTaker.addMemento(originator.saveStateToMemento());
        originator.setState("state 3");
        careTaker.addMemento(originator.saveStateToMemento());
        originator.setState("state 4");
        System.out.println("current state is : " + originator.getState());
        originator.getStateFromMemento(careTaker.getMemento(0));
        System.out.println("first state is : " + originator.getState());
    }
}
