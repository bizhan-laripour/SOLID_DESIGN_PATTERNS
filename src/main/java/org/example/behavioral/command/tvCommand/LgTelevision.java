package org.example.behavioral.command.tvCommand;

public class LgTelevision implements Tv{

    private int channel = 0;
    private int volume = 0;
    private boolean on = false;

    @Override
    public void turnOn() {
        this.on = true;
    }

    @Override
    public void turnOff() {
        this.on = false;
        reset();
    }

    @Override
    public void volumeUp() {
        this.volume++;
    }

    @Override
    public void volumeDown() {
        this.volume--;
    }

    @Override
    public void channelUp() {
        this.channel++;
    }

    @Override
    public void channelDown() {
        this.channel--;
    }

    public int getChannel() {
        return channel;
    }

    public int getVolume() {
        return volume;
    }

    public boolean isOn() {
        return on;
    }

    @Override
    public void reset() {
        this.channel = 0;
        this.volume = 0;
    }
}
