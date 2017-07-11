package creational.prototype;

/**
 * Created by vorh on 7/9/17.
 */
public class Rectangle extends Shape {

    public int width;
    public int height;

    public Rectangle() {
    }

    public Rectangle(Rectangle rectangle) {
        super(rectangle);

        if (rectangle != null){
            this.width = rectangle.width;
            this.height = rectangle.height;
        }

    }

    @Override
    public Shape clone() {
        return new Rectangle(this);
    }


    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Rectangle) || !super.equals(o)) return false;

        Rectangle rectangle = (Rectangle) o;


        return rectangle.height == height && rectangle.width == width;
    }
}
