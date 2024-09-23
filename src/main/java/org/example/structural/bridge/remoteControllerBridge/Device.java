package org.example.structural.bridge.remoteControllerBridge;

public interface Device {
    boolean isEnabled();
    void disable();
    void enable();
    void setVolume(int volume);
    int getVolume();
    void setChannel(int channel);
    int getChannel();
}
