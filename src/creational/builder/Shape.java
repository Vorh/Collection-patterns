package creational.builder;

/**
 * Created by vorh on 7/11/17.
 */
public class Shape {

    private int height;
    private int width;
    private int margin;

    public Shape(int height, int width, int margin) {
        this.height = height;
        this.width = width;
        this.margin = margin;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getMargin() {
        return margin;
    }

    public void setMargin(int margin) {
        this.margin = margin;
    }
}
