package org.example.structural.bridge.remoteControllerBridge;

public class Tv implements Device{

    private boolean isEnable;
    private int channel;
    private int volume;

    @Override
    public boolean isEnabled() {
        return isEnable;
    }

    @Override
    public void disable() {
        isEnable = false;
    }

    @Override
    public void enable() {
        isEnable = true;
    }

    @Override
    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Override
    public int getVolume() {
        return volume;
    }

    @Override
    public void setChannel(int channel) {
        this.channel = channel;
    }

    @Override
    public int getChannel() {
        return channel;
    }
}
