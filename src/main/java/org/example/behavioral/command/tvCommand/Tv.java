package org.example.behavioral.command.tvCommand;

public interface Tv {

    void turnOn();
    void turnOff();
    void volumeUp();
    void volumeDown();
    void channelUp();
    void channelDown();

    int getChannel();

    int getVolume();

    boolean isOn();
    void reset();
}
