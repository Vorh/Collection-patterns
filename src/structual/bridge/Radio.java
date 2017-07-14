package structual.bridge;

/**
 * Created by vorh on 7/14/17.
 */
public class Radio implements Device{
    private boolean on = false;
    @Override
    public boolean isEnabled() {
        return on;
    }

    @Override
    public void enable() {
        on = true;
        System.out.println("Radio on");

    }

    @Override
    public void disable() {
        on = false;
        System.out.println("Radio off");
    }
}
