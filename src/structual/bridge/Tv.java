package structual.bridge;

/**
 * Created by vorh on 7/14/17.
 */
public class Tv implements Device{

    private boolean on = false;

    @Override
    public boolean isEnabled() {
        return on;
    }

    @Override
    public void enable() {
        on = true;
        System.out.println("Tv on");
    }

    @Override
    public void disable() {
        on = false;
        System.out.println("Tv off");
    }
}
