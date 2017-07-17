package structual.proxy;

import java.util.Map;

/**
 * Created by vorh on 7/17/17.
 */
public interface ThirdPartyYoutubeLib {
    Map<String,Video> popularVideos();
    Video getVideo(String videoId);
}
