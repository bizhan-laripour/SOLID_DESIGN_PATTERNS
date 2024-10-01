package org.example.behavioral.command.basicCommand;

public class OpenFileCommand implements Command{

    private final Receiver receiver;

    public OpenFileCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.openFile();
    }
}
