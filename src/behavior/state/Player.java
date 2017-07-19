package behavior.state;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by vorh on 7/19/17.
 */
public class Player {
    private State state;
    private boolean playing = false;
    private List<String> playlist = new ArrayList<>();
    private int currentTrack = 0;

    public Player() {
        this.state = new ReadyState(this);
        setPlaying(true);

        for (int i = 0; i < 12; i++) {
            playlist.add("Track " + i);
        }

    }

    public void setPlaying(boolean playing) {
        this.playing = playing;
    }

    public boolean isPlaying() {
        return playing;
    }

    public void changeState(State state) {
        this.state = state;
    }

    public String startPlayback() {
        return "Playing " + playlist.get(currentTrack);
    }

    public void setCurrentTrackAfterStop() {
        currentTrack =0;
    }

    public String nextTrack() {
        currentTrack++;

        if (currentTrack > playlist.size() - 1){
            currentTrack = 0;
        }
        return "Playing " + playlist.get(currentTrack);
    }

    public String previousTrack() {
        currentTrack--;

        if (currentTrack <0){
            currentTrack = playlist.size() - 1;
        }
        return "Playing " + playlist.get(currentTrack);
    }

    public State getState() {
        return state;
    }
}
