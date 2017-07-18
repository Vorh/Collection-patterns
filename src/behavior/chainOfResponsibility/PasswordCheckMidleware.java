package behavior.chainOfResponsibility;

/**
 * Created by vorh on 7/18/17.
 */
public class PasswordCheckMidleware extends Middleware{


    @Override
    public boolean check(String email, String password) {
        if (!Server.checkPassword(email, password)){
            return false;
        }

        return checkNext(email, password);
    }
}
