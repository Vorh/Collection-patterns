package structual.bridge;

/**
 * Created by vorh on 7/14/17.
 */
public class Main {

    public static void main(String[] args) {
        Device radio = new Radio();
        Device tv = new Tv();


        Remote remote = new BasicRemote(radio);

        remote.power();
        remote.power();

        OtherRemote otherRemote = new OtherRemote(tv);
        otherRemote.on();
        otherRemote.off();
        otherRemote.power();
    }
}
