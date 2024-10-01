package org.example.behavioral.command.tvCommand;

public class ChannelUpCommand implements Command{

    private final Tv tv;

    public ChannelUpCommand(Tv tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        if(tv.isOn()){
            tv.channelUp();
        }else{
            System.out.println("TV is not on");
        }
    }
}
