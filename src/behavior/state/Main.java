package behavior.state;

/**
 * Created by vorh on 7/19/17.
 */
public class Main {

    public static void main(String[] args) {
        Player player = new Player();
        UI ui = new UI(player);

        ui.init();
    }
}
