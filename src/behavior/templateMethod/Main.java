package behavior.templateMethod;

/**
 * Created by vorh on 7/19/17.
 */
public class Main {

    public static void main(String[] args) {

        Network networkFacebook = new Facebook("Admin","Admin");
        Network networkVk = new Vk("Admin","Admin");


        networkVk.post("TEst");
        networkFacebook.post("TEST");
    }
}
