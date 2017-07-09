package generative.prototype;

/**
 * Created by vorh on 7/9/17.
 */
public class Circle extends Shape {

    public int radius;

    public Circle() {
    }

    public Circle(Circle circle) {
        super(circle);

        if (circle != null){
            this.radius = circle.radius;
        }
    }

    @Override
    public Shape clone() {
        return new Circle(this);
    }


    @Override
    public boolean equals(Object o) {

        if (!(o instanceof Circle) || !super.equals(o)) return false;
        Circle circle = (Circle) o;

        return circle.radius == radius;
    }
}
