package org.example.behavioral.state;

public class PlayingState extends State{

    protected PlayingState(Player player) {
        super(player);
    }

    @Override
    public String onLock() {
        player.setState(new LockedState(player));
        player.setCurrentTrackAfterStop();
        return "Stop Playing";
    }

    @Override
    public String onPlay() {
        player.setState(new ReadyState(player));
        return "Paused ...";
    }

    @Override
    public String onNext() {
        return player.nextTrack();
    }

    @Override
    public String onPrevious() {
        return player.previousTrack();
    }
}
