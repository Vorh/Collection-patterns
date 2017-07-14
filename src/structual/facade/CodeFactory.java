package structual.facade;

/**
 * Created by vorh on 7/14/17.
 */
public class CodeFactory {

    public static Codec extract(VideoFile file){
        String type = file.getCodeType();
        if (type.equals("mp4")){
            System.out.println("Code Factory: extracting mpeg audio ....");
            return new MPEG4CompressionCodec();
        }else {
            System.out.println("Code Factory: extracting ogg audio ....");
            return new OggCompressionCodec();
        }

    }
}
