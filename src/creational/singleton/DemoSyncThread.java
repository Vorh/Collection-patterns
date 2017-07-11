package creational.singleton;

/**
 * Created by vorh on 7/7/17.
 */
public class DemoSyncThread {


    public static void main(String[] args) {
        System.out.println("If you see the same value, then singleton was reused (yay!)");
        System.out.println("If you see different values, then 2 singletons were created (booo!!)");
        System.out.println("Result:");


        Thread threadFoo = new Thread(new ThreadFoo());
        Thread threadBar = new Thread(new ThreadBar());

        threadFoo.start();
        threadBar.start();
    }


    private static class ThreadFoo implements Runnable{

        @Override
        public void run() {
            SingletonSync singletonSync = SingletonSync.getInstance("foo");
            System.out.println(singletonSync.value);
        }
    }

    private static class ThreadBar implements Runnable{

        @Override
        public void run() {
            SingletonSync singletonSync = SingletonSync.getInstance("bar");
            System.out.println(singletonSync.value);
        }
    }



}
