package org.example.behavioral.command.tvCommand;

public class VolumeUpCommand implements Command{

    private final Tv tv;

    public VolumeUpCommand(Tv tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        if(tv.isOn()){
            tv.volumeUp();
        }else {
            System.out.println("tv is not on");
        }
    }
}
