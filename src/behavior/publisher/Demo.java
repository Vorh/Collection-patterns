package behavior.publisher;

/**
 * Created by vorh on 7/18/17.
 */
public class Demo {

    public static void main(String[] args) {

        Editor editor = new Editor();
        editor.events.subsctibe("open",new LogOpenListener("/test.txt"));
        editor.events.subsctibe("save",new EmailNotificationListener("test.@test.com"));

        try {
            editor.openFile("test.txt");
            editor.saveFile();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
