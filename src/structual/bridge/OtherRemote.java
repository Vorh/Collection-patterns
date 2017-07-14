package structual.bridge;

/**
 * Created by vorh on 7/14/17.
 */
public class OtherRemote extends BasicRemote{

    public OtherRemote(Device device) {
        super(device);
    }

    public void on(){
        device.enable();
    }
    public void off(){
        device.disable();
    }
}
