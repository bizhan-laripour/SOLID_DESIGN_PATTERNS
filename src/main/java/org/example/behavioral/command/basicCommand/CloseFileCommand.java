package org.example.behavioral.command.basicCommand;

public class CloseFileCommand implements Command{

    private final Receiver receiver;

    public CloseFileCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.closeFile();
    }
}
