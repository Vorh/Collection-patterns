package generative.factoryMehod;

/**
 * Created by vorh on 7/11/17.
 */
public class HtmlDialog extends Dialog{
    @Override
    public Button createButton() {
        return new HtmlButton();
    }
}
