package creational.abstractFactory;

/**
 * Created by vorh on 7/11/17.
 */
public class GUIFactoryWindows implements GUIFactory{
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public CheckBox createCheckBox() {
        return new CheckBoxWindows();
    }
}
