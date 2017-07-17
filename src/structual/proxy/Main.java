package structual.proxy;

/**
 * Created by vorh on 7/17/17.
 */
public class Main {

    public static void main(String[] args) {

        YoutubeService youtubeService = new YoutubeService();
        VideoDownloader nativeDownloader = new VideoDownloader(youtubeService);
        VideoDownloader smartDownloader = new VideoDownloader(new YoutubeCacheProxy(youtubeService));


        long nativeTime = test(nativeDownloader);
        long smartTime = test(smartDownloader);

        System.out.print("Time saved by caching proxy: " + (nativeTime - smartTime) + "ms");
    }

    private static long test(VideoDownloader downloader){
        long startTime =System.currentTimeMillis();

        downloader.renderPopularVideos();
        downloader.renderVideoPage("1");
        downloader.renderVideoPage("2");
        downloader.renderVideoPage("3");
        downloader.renderVideoPage("1");
        downloader.renderVideoPage("1");
        downloader.renderVideoPage("3");
        downloader.renderVideoPage("3");

        long endTime = System.currentTimeMillis() - startTime;

        System.out.println("Time service " + endTime);
        return endTime;
    }
}
