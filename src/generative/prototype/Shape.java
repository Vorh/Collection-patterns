package generative.prototype;

/**
 * Created by vorh on 7/9/17.
 */
public abstract class Shape {
    public int x;
    public int y;
    public int color;

    public Shape() {
    }

    public Shape(Shape shape){
        if (shape != null){
            this.x = shape.x;
            this.y = shape.y;
            this.color = shape.color;
        }
    }

    public abstract Shape clone();

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Shape)) return false;
        Shape shape = (Shape) o;

        return shape.x == x && shape.y == y && shape.color==color;
    }
}
