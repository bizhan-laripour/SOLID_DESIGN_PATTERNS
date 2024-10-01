package org.example.behavioral.chainOfResponsibility.withProxy;

import java.util.ArrayList;
import java.util.List;

public class ServiceProxy implements ServiceInterface{

    private ServiceInterface serviceInterface;

    private final CheckUrlChain checkUrlChain;

    private static List<String> bannedUrls = new ArrayList<>();

    static {
        bannedUrls.add("www.hi.com");
        bannedUrls.add("www.jsl.com");
        bannedUrls.add("www.amazon.com");
        bannedUrls.add("www.oracle.com");
        bannedUrls.add("www.hello.com");
    }

    private ServiceProxy(CheckUrlChain checkUrlChain) {
        this.checkUrlChain = checkUrlChain;
    }

    @Override
    public void service(String url) throws Exception {
        if (serviceInterface == null) {
            serviceInterface = new ConcreteService();
            if (!bannedUrls.contains(url)) {
                checkUrlChain.checkUrl(url);
                serviceInterface.service(url);
            }else{
                throw new Exception("this url is banned");
            }
        }
    }

    public static class Builder {
        private CheckUrlChain checkUrlChain;

        public Builder setCheckUrlChain(CheckUrlChain checkUrlChain) {
            this.checkUrlChain = checkUrlChain;
            return this;
        }
        public ServiceProxy build() {
            return new ServiceProxy(checkUrlChain);
        }
    }

    public void addBannedUrl(String bannedUrl) {
        bannedUrls.add(bannedUrl);
    }

    public void deleteBannedUrl(String bannedUrl) {
        bannedUrls.remove(bannedUrl);
    }

    public List<String> getBannedUrls() {
        return bannedUrls;
    }
}
