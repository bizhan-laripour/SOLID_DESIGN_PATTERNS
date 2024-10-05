package org.example.behavioral.memento.professionalEditor;

public class SaveCommand implements Command{

    private Receiver receiver;

    public SaveCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public Object execute(Object ... objects) {
        return receiver.save();
    }
}
