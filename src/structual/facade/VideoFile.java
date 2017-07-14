package structual.facade;

/**
 * Created by vorh on 7/14/17.
 */
public class VideoFile {
    private String name;
    private String codeType;


    public VideoFile(String name) {
        this.name = name;
        this.codeType = name.substring(name.indexOf(".")+1,name.length());
    }

    public String getName() {
        return name;
    }

    public String getCodeType() {
        return codeType;
    }
}
