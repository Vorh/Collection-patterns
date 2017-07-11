package creational.factoryMehod;

/**
 * Created by vorh on 7/11/17.
 */
public class HtmlButton implements Button{
    @Override
    public void render() {
        System.out.println("Render html button");
        onClick();
    }

    @Override
    public void onClick() {
        System.out.println("Click html button");
    }
}
