package generative.abstractFactory;

/**
 * Created by vorh on 7/11/17.
 */
public class Main {

    public static void main(String[] args) {
        GUIFactory guiFactory;
        if (System.getProperty("env","").equals("mac os")){
            guiFactory = new GUIFactoryMacOs();
        }else {
            guiFactory = new GUIFactoryWindows();
        }

        Application application = new Application(guiFactory);
        application.paint();
    }
}
