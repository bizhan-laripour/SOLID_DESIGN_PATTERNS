package org.example.behavioral.chainOfResponsibility.withProxy;

public class CheckPreDomain implements CheckUrlChain{

    private final CheckUrlChain checkUrlChain;

    public CheckPreDomain(CheckUrlChain checkUrlChain) {
        this.checkUrlChain = checkUrlChain;
    }

    @Override
    public void checkUrl(String url) throws Exception {
        if (url.startsWith("http://") || url.startsWith("https://")) {
            checkUrlChain.checkUrl(url);
        }else {
            throw new Exception("url must contains http or https");
        }
    }
}
