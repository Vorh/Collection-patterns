package behavior.publisher;

import java.io.File;

/**
 * Created by vorh on 7/18/17.
 */
public interface EventListener {
    void update(String eventType, File file);
}
