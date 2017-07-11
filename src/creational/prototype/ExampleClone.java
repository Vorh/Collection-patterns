package creational.prototype;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by vorh on 7/9/17.
 */
public class ExampleClone {

    public static void main(String[] args) {

        List<Shape> shapes = new ArrayList<>();
        List<Shape> sharesCopy = new ArrayList<>();

        Circle circle = new Circle();
        circle.x = 10;
        circle.y = 20;
        circle.radius = 15;
        shapes.add(circle);

        Circle anotherCircle = (Circle) circle.clone();
        shapes.add(anotherCircle);

        Rectangle rectangle = new Rectangle();
        rectangle.width = 10;
        rectangle.height = 20;
        shapes.add(rectangle);


        for (Shape shape : shapes) {
            sharesCopy.add(shape.clone());
        }

        for (int i = 0; i < shapes.size(); i++) {
            if (shapes.get(i) != (sharesCopy.get(i))){
                System.out.println(i + ": Shapes are different objects");

                if (shapes.get(i).equals(sharesCopy.get(i))){
                    System.out.println(i + ": And they are identical ");
                }else {
                    System.out.println(i + ": But they are not identical ");
                }
            }else {
                System.out.println(i + ": Shape objects are the same");
            }
        }
    }
}
