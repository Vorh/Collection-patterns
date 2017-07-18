package behavior.publisher;

import java.io.File;

/**
 * Created by vorh on 7/18/17.
 */
public class EmailNotificationListener implements EventListener{

    private String email;

    public EmailNotificationListener(String email) {
        this.email = email;
    }

    @Override
    public void update(String eventType, File file) {
        System.out.println("Send email to " + email + ": Someone has performed " + eventType + " operation with the following file: " + file.getName());
    }
}
