package org.example.behavioral.memento.professionalEditor;

public class RestoreCommand implements Command {

    private Receiver receiver;

    public RestoreCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public Object execute(Object ... objects) {
       return receiver.restore(objects[0]);
    }
}
