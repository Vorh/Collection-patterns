package generative.builder;

/**
 * Created by vorh on 7/11/17.
 */
public class Director {

    public void constructorSquare(Builder builder) {
        builder.setHeight(1)
                .setMargin(1)
                .setWidth(1);
    }
}
