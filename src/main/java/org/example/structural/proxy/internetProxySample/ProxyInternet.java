package org.example.structural.proxy.internetProxySample;

import java.util.ArrayList;
import java.util.List;

public class ProxyInternet implements InternetSubject{

    private InternetSubject internetSubject;

    private static List<String> bannedSites = new ArrayList<>();

    static {
        bannedSites.add("www.hi.com");
        bannedSites.add("www.jsl.com");
        bannedSites.add("www.amazon.com");
        bannedSites.add("www.oracle.com");
        bannedSites.add("www.hello.com");
    }

    @Override
    public void connectToInternet(String url) throws Exception {
        if(internetSubject == null){
            internetSubject = new RealInternet();
        }
        if (bannedSites.contains(url)){
            throw new Exception("Internet connection is already banned!");
        }
        internetSubject.connectToInternet(url);
    }


    public void addBannedSite(String site) {
        bannedSites.add(site);
    }
}
