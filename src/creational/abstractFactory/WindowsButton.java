package creational.abstractFactory;

/**
 * Created by vorh on 7/11/17.
 */
public class WindowsButton implements Button{
    @Override
    public void paint() {
        System.out.println("Paint windows button");
    }
}
