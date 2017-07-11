package creational.prototype;

/**
 * Created by vorh on 7/9/17.
 */
public class ExampleCloneCache {


    public static void main(String[] args) {

        ShapeCache shapeCache = new ShapeCache();
        Shape shape1 = shapeCache.get("Big green circle");
        Shape shape2 = shapeCache.get("Medium blue rectangle");
        Shape shape3 = shapeCache.get("Medium blue rectangle");

        if (shape1 != shape2 && !shape1.equals(shape2)){
            System.out.println("Big green circle != Medium blue rectangle !");
        } else {
            System.out.println("Big green circle == Medium blue rectangle !");

        }

        if (shape2 != shape3){
            System.out.println("Medium blue objects rectangles are two different objects");
            if (shape2.equals(shape3)){
                System.out.println("And they are identical ");
            }else {
                System.out.println("But they not identical ");
            }
        }else {
            System.out.println("Rectangle objects are the same ");
        }
    }
}
