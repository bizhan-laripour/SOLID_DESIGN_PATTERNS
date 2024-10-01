package org.example.behavioral.chainOfResponsibility.withProxy;

public class ConcreteService implements ServiceInterface{


    @Override
    public void service(String url) {
        System.out.println("Connecting to : "+url);
        try {
            Thread.sleep(3000);
            System.out.println("Connected to : "+url + " Successfully");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
