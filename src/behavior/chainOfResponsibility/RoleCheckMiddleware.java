package behavior.chainOfResponsibility;

/**
 * Created by vorh on 7/18/17.
 */
public class RoleCheckMiddleware extends Middleware{


    @Override
    public boolean check(String email, String password) {
        if (email.equals("admin@test.com")){
            System.out.println("Hello admin!");
            return true;
        }
        System.out.println("Hello user!");
        return checkNext(email, password);
    }
}
