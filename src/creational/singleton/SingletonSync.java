package creational.singleton;

/**
 * Created by vorh on 7/7/17.
 */

public final class SingletonSync {


    private static volatile SingletonSync instance;
    public static String value;

    private SingletonSync(String value){

        try {
            Thread.currentThread().sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        this.value = value;
    }

    public static SingletonSync getInstance(String value){
        if (instance == null){
            synchronized (SingletonSync.class){
                if (instance ==null){
                    instance = new SingletonSync(value);
                }
            }
        }

        return instance;
    }
}
