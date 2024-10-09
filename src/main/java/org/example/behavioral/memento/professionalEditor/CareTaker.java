package org.example.behavioral.memento.professionalEditor;

public class CareTaker {

    private Object object;

    public void save(Receiver receiver){
        object = receiver.save();
    }

    public void roleBack(Receiver receiver){
        receiver.restore(object);
    }

}
