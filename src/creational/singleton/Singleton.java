package creational.singleton;

/**
 * Created by vorh on 7/7/17.
 */
public class Singleton {


    private static Singleton instance;
    public String value;


    private Singleton(String value) {

        try {
            Thread.currentThread().sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        this.value = value;
    }

    public static Singleton getInstance(String value) {
        if (instance == null) {
            instance = new Singleton(value);
        }
        return instance;
    }
}
