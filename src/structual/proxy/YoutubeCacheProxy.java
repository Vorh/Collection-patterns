package structual.proxy;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by vorh on 7/17/17.
 */
public class YoutubeCacheProxy implements ThirdPartyYoutubeLib{
    private ThirdPartyYoutubeLib service;

    private Map<String ,Video> cachePopular =new HashMap<>();
    private Map<String ,Video> cacheAll =new HashMap<>();

    public YoutubeCacheProxy(ThirdPartyYoutubeLib service) {
        this.service = service;
    }

    @Override
    public Map<String, Video> popularVideos() {
        if (cachePopular.isEmpty()){
            cachePopular = service.popularVideos();
        }else {
            System.out.println("Received popular video from cache");
        }
        return cachePopular;
    }

    @Override
    public Video getVideo(String videoId) {
        Video video = cacheAll.get(videoId);
        if (video == null){
            video = service.getVideo(videoId);
            cacheAll.put(videoId,video);
        }else {
            System.out.println("Received video " + videoId + " from cache");
        }
        return video;
    }

    public void reset(){
        cacheAll.clear();
        cachePopular.clear();
    }
}
