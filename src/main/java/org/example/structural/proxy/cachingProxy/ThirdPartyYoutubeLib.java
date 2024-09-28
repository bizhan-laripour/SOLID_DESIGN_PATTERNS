package org.example.structural.proxy.cachingProxy;

import java.util.Map;

public interface ThirdPartyYoutubeLib {

    Map<String , Video> popularVideo();
    Video getVideo(String videoId);
}
