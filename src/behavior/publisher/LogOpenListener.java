package behavior.publisher;

import java.io.File;

/**
 * Created by vorh on 7/18/17.
 */
public class LogOpenListener implements EventListener{

    private File log;

    public LogOpenListener(String log) {
        this.log = new File(log);
    }

    @Override
    public void update(String eventType, File file) {
        System.out.println("Save to log " + log + ": Someone has performed " + eventType + " operation with the following file: " + file.getName());
    }
}
