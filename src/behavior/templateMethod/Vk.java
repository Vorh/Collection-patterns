package behavior.templateMethod;

/**
 * Created by vorh on 7/19/17.
 */
public class Vk extends Network{

    public Vk(String name, String password) {
        this.username = name;
        this.password = password;
    }

    @Override
    protected boolean logIn(String username, String password) {
        System.out.println("Checking user's parameters");
        System.out.println("Name " + this.username);
        System.out.print("Password: ");
        for (int i = 0; i < this.password.length(); i++) {
            System.out.print("*");
        }

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("\nLogin success Vk");

        return true;
    }

    @Override
    protected boolean sendData(byte[] data) {
        System.out.println("Posted " + new String(data));
        return true;
    }

    @Override
    protected void logOut() {
        System.out.println("LoOut " + username);
    }
}
