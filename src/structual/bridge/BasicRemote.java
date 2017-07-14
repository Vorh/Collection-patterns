package structual.bridge;

/**
 * Created by vorh on 7/14/17.
 */
public class BasicRemote implements Remote{
    protected Device device;

    public BasicRemote(Device device) {
        this.device = device;
    }

    @Override
    public void power() {
        if (device.isEnabled()){
            device.disable();
        }else {
            device.enable();
        }
    }
}
