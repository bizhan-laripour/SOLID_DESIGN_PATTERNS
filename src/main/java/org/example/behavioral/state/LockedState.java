package org.example.behavioral.state;

public class LockedState extends State{

    protected LockedState(Player player) {
        super(player);
        player.setPlaying(false);
    }

    @Override
    public String onLock() {
        if(player.isPlaying()){
            player.setState(new ReadyState(player));
            return "Stop playing ...";
        }else{
            return "Locked ...";
        }
    }

    @Override
    public String onPlay() {
        player.setState(new PlayingState(player));
        return "Ready ...";
    }

    @Override
    public String onNext() {
        return "Locked ...";
    }

    @Override
    public String onPrevious() {
        return "Locked ...";
    }
}
