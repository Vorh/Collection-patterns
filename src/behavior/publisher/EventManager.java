package behavior.publisher;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by vorh on 7/18/17.
 */
public class EventManager {

    private Map<String ,List<EventListener>> listeners = new HashMap();

    public EventManager(String... operations){
        for (String operation : operations) {
            this.listeners.put(operation,new ArrayList<>());
        }
    }

    public void subsctibe(String eventType,EventListener listener){
        List<EventListener> users = listeners.get(eventType);
        users.add(listener);
    }

    public void unsubsctibe(String eventType,EventListener listener){
        List<EventListener> users = this.listeners.get(eventType);
        int indexOf = users.indexOf(listener);
        users.remove(indexOf);

    }

    public void notify(String eventType, File file){
        List<EventListener> users = listeners.get(eventType);
        for (EventListener listener : users) {
            listener.update(eventType,file);
        }
    }
}
