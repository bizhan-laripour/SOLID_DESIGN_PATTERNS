package org.example.behavioral.command.basicCommand;

public class WriteFileCommand implements Command{

    private final Receiver receiver;

    public WriteFileCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.writeFile();
    }
}
