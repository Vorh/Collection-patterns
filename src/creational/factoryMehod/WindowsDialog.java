package creational.factoryMehod;

/**
 * Created by vorh on 7/11/17.
 */
public class WindowsDialog extends Dialog{
    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}
