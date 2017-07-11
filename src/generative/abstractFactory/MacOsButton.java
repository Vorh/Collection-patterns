package generative.abstractFactory;

/**
 * Created by vorh on 7/11/17.
 */
public class MacOsButton implements Button{
    @Override
    public void paint() {
        System.out.println("Paint button MacOs");
    }
}
