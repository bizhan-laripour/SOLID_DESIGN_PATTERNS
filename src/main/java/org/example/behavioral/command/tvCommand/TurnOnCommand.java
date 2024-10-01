package org.example.behavioral.command.tvCommand;

public class TurnOnCommand implements Command{

    private final Tv tv;

    public TurnOnCommand(Tv tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.turnOn();
    }
}
