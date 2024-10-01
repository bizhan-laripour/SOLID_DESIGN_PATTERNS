package org.example.behavioral.command.tvCommand;

public class VolumeDownCommand implements Command{

    private final Tv tv;

    public VolumeDownCommand(Tv tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        if(tv.isOn()) {
            tv.volumeDown();
        }else {
            System.out.println("tv is not on");
        }
    }
}
