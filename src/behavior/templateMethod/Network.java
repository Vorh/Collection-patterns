package behavior.templateMethod;

/**
 * Created by vorh on 7/19/17.
 */
public abstract class Network {

    protected String username;
    protected String password;

    public boolean post(String message){

        if (logIn(username,password)){

            boolean result = sendData(message.getBytes());
            logOut();

            return result;
        }

        return false;
    }

    protected abstract boolean logIn(String username, String password);
    protected abstract boolean sendData(byte[] data);
    protected abstract void logOut();

}
