package org.example.behavioral.command.tvCommand;

public class ChannelDownCommand implements Command{

    private final Tv tv;

    public ChannelDownCommand(Tv tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        if(tv.isOn()) {
            tv.channelDown();
        }else {
            System.out.println("TV is not on");
        }
    }
}
