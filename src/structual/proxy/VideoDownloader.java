package structual.proxy;

import java.util.Map;

/**
 * Created by vorh on 7/17/17.
 */
public class VideoDownloader {
    private ThirdPartyYoutubeLib api;

    public VideoDownloader(ThirdPartyYoutubeLib api) {
        this.api = api;
    }

    public void renderVideoPage(String videoId){
        Video video = api.getVideo(videoId);
        System.out.println("-------------------------------");
        System.out.println("Video page (imagine fancy HTML)");
        System.out.println("ID: " + video.id);
        System.out.println("Title: " + video.title);
        System.out.println("Video: " + video.data);
    }

    public void renderPopularVideos() {
        Map<String, Video> list = api.popularVideos();
        System.out.println("-------------------------------");
        System.out.println("Most popular videos on Youtube (imagine fancy HTML)");
        for (Video video : list.values()) {
            System.out.println("ID: " + video.id + " / Title: " + video.title);
        }
    }
}
