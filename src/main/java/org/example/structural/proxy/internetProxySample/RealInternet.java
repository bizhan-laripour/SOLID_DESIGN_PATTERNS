package org.example.structural.proxy.internetProxySample;

public class RealInternet implements InternetSubject{


    @Override
    public void connectToInternet(String url) {
        System.out.println("connect to: "+url);
    }
}
