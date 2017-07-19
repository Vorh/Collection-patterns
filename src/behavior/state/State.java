package behavior.state;

/**
 * Created by vorh on 7/19/17.
 */
public abstract class State {
    protected Player player;


    public State(Player player) {
        this.player = player;
    }

    public abstract String onLock();
    public abstract String onPlay();
    public abstract String onNext();
    public abstract String onPrevious();


}
