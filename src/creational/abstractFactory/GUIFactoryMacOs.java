package creational.abstractFactory;

/**
 * Created by vorh on 7/11/17.
 */
public class GUIFactoryMacOs implements GUIFactory{



    @Override
    public Button createButton() {
        return new MacOsButton();
    }

    @Override
    public CheckBox createCheckBox() {
        return new CheckBoxMacOs();
    }
}
