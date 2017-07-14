package structual.facade;

import java.io.File;

/**
 * Created by vorh on 7/14/17.
 */
public class Main {

    public static void main(String[] args) {
        VideoConversionFacade facade = new VideoConversionFacade();
        File video = facade.convertVido("test.ogg","mp4");
    }
}
