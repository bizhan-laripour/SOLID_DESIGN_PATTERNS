package org.example.structural.bridge.remoteControllerBridge;

public abstract class Remote {

    private final Device device;

    protected Remote(Device device) {
        this.device = device;
    }

    public void volumeUp(){
        device.setVolume(device.getVolume() + 1);
    }

    public void volumeDown(){
        device.setVolume(device.getVolume() - 1);
    }

    public void channelUp(){
        device.setChannel(device.getChannel() + 1);
    }
    public void channelDown(){
        device.setChannel(device.getChannel() - 1);
    }

    public void togglePower(boolean on){
        if(on) device.disable();
        else device.enable();
    }
}
