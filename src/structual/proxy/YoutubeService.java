package structual.proxy;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by vorh on 7/17/17.
 */
public class YoutubeService implements ThirdPartyYoutubeLib {

    private Map<String,Video> allVideo = new HashMap<>();
    private Map<String,Video> popularVideo = new HashMap<>();

    public YoutubeService() {

        Video video1 = new Video("1","CATS", "DATA");
        Video video2 = new Video("2","DOGS", "DATA");
        Video video3 = new Video("3","TREE", "DATA");

        allVideo.put("1",video1);
        allVideo.put("2",video2);
        allVideo.put("3",video3);

        popularVideo.put("1",video1);
    }

    @Override
    public Map<String, Video> popularVideos() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return popularVideo;
    }

    @Override
    public Video getVideo(String videoId) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return allVideo.get(videoId);
    }
}
