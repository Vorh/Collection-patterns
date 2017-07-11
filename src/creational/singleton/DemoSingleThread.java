package creational.singleton;

/**
 * Created by vorh on 7/7/17.
 */
public class DemoSingleThread {

    public static void main(String[] args) {

        System.out.println("If you see the same value, then singleton was reused (yay!)");
        System.out.println("If you see different values, then 2 singletons were created (booo!!)");
        System.out.println("Result:");

        Singleton instanceFirst = Singleton.getInstance("foo");
        Singleton instanceSecond= Singleton.getInstance("bar");

        System.out.println(instanceFirst.value);
        System.out.println(instanceSecond.value);
    }
}
