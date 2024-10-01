package org.example.behavioral.chainOfResponsibility.withProxy;

public class CheckPostDomain implements CheckUrlChain{

    private final CheckUrlChain checkUrlChain;

    public CheckPostDomain(CheckUrlChain checkUrlChain) {
        this.checkUrlChain = checkUrlChain;
    }

    @Override
    public void checkUrl(String url) throws Exception {
        if (!url.endsWith("ir")) {
            throw new Exception("Just Iran's Domain is acceptable");
        }else{
            checkUrlChain.checkUrl(url);
        }
    }
}
