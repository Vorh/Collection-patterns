package creational.factoryMehod;

/**
 * Created by vorh on 7/11/17.
 */
public abstract class Dialog {

    public void renderWindow(){
        Button button = createButton();
        button.render();
    }

    public abstract Button createButton();
}
