package org.example.structural.proxy.internetProxySample;

public class Client {

    public static void main(String[] args) throws Exception {
        ProxyInternet proxy = new ProxyInternet();
        proxy.connectToInternet("www.xxl.com");

    }
}
