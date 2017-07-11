package generative.factoryMehod;

/**
 * Created by vorh on 7/11/17.
 */
public class Main {

    private static Dialog dialog;

    public static void main(String[] args) {
        configure();
        dialog.renderWindow();
    }

    public static void configure(){
        if (System.getProperty("evn","").equals("win 10")){
            dialog = new WindowsDialog();
        }else {
            dialog = new HtmlDialog();
        }
    }
}
