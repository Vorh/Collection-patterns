package generative.abstractFactory;

/**
 * Created by vorh on 7/11/17.
 */
public class Application {

    private Button button;
    private CheckBox checkBox;

    public Application(GUIFactory guiFactory) {
        button = guiFactory.createButton();
        checkBox = guiFactory.createCheckBox();
    }

    public void paint(){
        button.paint();
        checkBox.paint();
    }
}
