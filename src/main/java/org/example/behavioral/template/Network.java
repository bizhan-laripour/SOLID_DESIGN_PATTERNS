package org.example.behavioral.template;

public abstract class Network {

    protected String username;
    protected String password;

    public boolean post(String message) throws InterruptedException {
        if(login()){
            boolean result = sendDate(message.getBytes());
            logout();
            return result;
        }
        return false;
    }

    protected void simulateNetworkLatency() throws InterruptedException {
        for(int i=0 ; i<10 ; i++){
            System.out.print(".");
            Thread.sleep(500);
        }
    }

    public abstract boolean login() throws InterruptedException;
    public abstract boolean sendDate(byte[] data);
    public abstract void logout();



}
