package creational.factoryMehod;

/**
 * Created by vorh on 7/11/17.
 */
public class WindowsButton implements Button{
    @Override
    public void render() {
        System.out.println("Windows button render");
        onClick();
    }

    @Override
    public void onClick() {
        System.out.println("Click on windows button");
    }
}
