package structual.facade;

/**
 * Created by vorh on 7/14/17.
 */
public class BitrateReader {

    public static VideoFile read(VideoFile file, Codec codec){
        System.out.println("reading file ....");
        return file;
    }

    public static VideoFile convert(VideoFile file,Codec codec){
        System.out.println("Convert file ....");
        return file;
    }
}
