package org.example.behavioral.memento.state;

public class Originator {

    private String state;


    public Memento saveStateToMemento(){
        return new Memento(state);
    }

    public void restoreStateFromMemento(Memento memento){
        state = memento.getState();
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
