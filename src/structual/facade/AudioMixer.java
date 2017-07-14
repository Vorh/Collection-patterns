package structual.facade;

import java.io.File;

/**
 * Created by vorh on 7/14/17.
 */
public class AudioMixer {
    public static File fix(VideoFile file){
        System.out.println("Audio mixer : fixing audio ....");
        return new File("tmp");
    }
}
