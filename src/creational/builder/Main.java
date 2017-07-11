package creational.builder;

/**
 * Created by vorh on 7/11/17.
 */
public class Main {

    public static void main(String[] args) {
        BuilderShape builder = new BuilderShape();

        Director director  = new Director();

        director.constructorSquare(builder);
        Shape result = builder.getResult();

        System.out.println("Height: " +result.getHeight());
        System.out.println("Width: " +result.getWidth());
        System.out.println("Margin: " +result.getMargin());
    }
}
