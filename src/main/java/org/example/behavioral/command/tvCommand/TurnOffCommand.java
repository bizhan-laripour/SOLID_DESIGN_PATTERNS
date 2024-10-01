package org.example.behavioral.command.tvCommand;

public class TurnOffCommand implements Command {

    private final Tv tv;

    public TurnOffCommand(Tv tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.turnOff();
    }
}
