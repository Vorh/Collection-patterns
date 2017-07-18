package behavior.chainOfResponsibility;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by vorh on 7/18/17.
 */
public class Server {

    private static Map<String,String> users = new HashMap<>();
    private Middleware middleware;


    public void setMiddleware(Middleware middleware) {
        this.middleware = middleware;
    }

    public boolean logIn(String email, String password){
        if (middleware.check(email, password)){
            System.out.println("Authorization have been success");

            return true;
        }
        return false;
    }

    public void register(String email,String password){
        users.put(email,password);
    }

    public static boolean hasEmail(String email){
        return users.containsKey(email);
    }

    public static boolean checkPassword(String login, String password){
        return users.get(login).equals(password);
    }
}
