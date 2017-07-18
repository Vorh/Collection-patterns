package behavior.chainOfResponsibility;

/**
 * Created by vorh on 7/18/17.
 */
public class UserExistMiddleware extends Middleware{


    @Override
    public boolean check(String email, String password) {
        if (!Server.hasEmail(email)){
            return false;
        }
        return checkNext(email,password);
    }
}
