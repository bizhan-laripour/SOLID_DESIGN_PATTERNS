package org.example.behavioral.state;

public class UI extends State{

    protected UI(Player player) {
        super(player);
    }

    @Override
    public String onLock() {
        return player.getState().onLock();
    }

    @Override
    public String onPlay() {
        return player.getState().onPlay();
    }

    @Override
    public String onNext() {
        return player.getState().onNext();
    }

    @Override
    public String onPrevious() {
        return player.getState().onPrevious();
    }
}
