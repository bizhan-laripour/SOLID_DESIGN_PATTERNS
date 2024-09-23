package org.example.structural.bridge.remoteControllerBridge;

public class Client {

    public static void main(String[] args) {
        Device device = new Radio();
        Remote advancedRemote = new AdvancedRemote(device);
        advancedRemote.channelUp();
        System.out.println(device.getChannel());
    }
}
