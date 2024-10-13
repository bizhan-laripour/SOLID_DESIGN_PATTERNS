package org.example.behavioral.state;

public abstract class State {

    protected Player player;

    protected State(Player player) {
        this.player = player;
    }

    public abstract String onLock();
    public abstract String onPlay();
    public abstract String onNext();
    public abstract String onPrevious();
}
