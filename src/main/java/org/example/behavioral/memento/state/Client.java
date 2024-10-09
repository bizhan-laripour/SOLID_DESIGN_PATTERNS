package org.example.behavioral.memento.state;

public class Client {

    public static void main(String[] args) {
        Originator originator = new Originator();
        CareTaker careTaker = new CareTaker();

        originator.setState("hello bizhan");
        careTaker.addMemento(originator.saveStateToMemento());
        originator.setState("hello laripour");
        System.out.println("Originator state: " + originator.getState());
        originator.restoreStateFromMemento(careTaker.getMemento(0));
        System.out.println("Originator state: " + originator.getState());

    }
}
