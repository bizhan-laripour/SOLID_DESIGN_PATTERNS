package org.example.behavioral.chainOfResponsibility.withProxy;

public class EndOfChain implements CheckUrlChain{
    @Override
    public void checkUrl(String url) {
        System.out.println("Checking url: " + url +" finished");
    }
}
