package org.example.behavioral.command.basicCommand;

public class Invoker {

    private final Command command;

    public Invoker(Command command) {
        this.command = command;
    }
    public void execute() {
        command.execute();
    }
}
