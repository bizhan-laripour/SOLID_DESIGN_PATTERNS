package org.example.behavioral.memento.professionalEditor;

public class WriteCommand implements Command{

    protected Receiver receiver;

    public WriteCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public Object execute(Object... objects) {
       return receiver.write(objects[0].toString());
    }
}
