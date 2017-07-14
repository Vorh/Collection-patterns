package structual.facade;

import java.io.File;

/**
 * Created by vorh on 7/14/17.
 */
public class VideoConversionFacade {

    public File  convertVido(String fileName, String format){
        System.out.println("Conversation started ....");
        VideoFile videoFile = new VideoFile(fileName);
        Codec codec = CodeFactory.extract(videoFile);

        Codec destinationCodec;

        if (format.equals("mp4")){
            destinationCodec = new OggCompressionCodec();
        }else {
            destinationCodec = new MPEG4CompressionCodec();
        }
        VideoFile buffer = BitrateReader.read(videoFile,codec);
        VideoFile intermediateResult = BitrateReader.convert(buffer,destinationCodec);

        File result = (new AudioMixer()).fix(intermediateResult);
        System.out.println("Conversation completed");
        return result;
    }
}
