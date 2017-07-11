package creational.builder;

/**
 * Created by vorh on 7/11/17.
 */
public class BuilderShape implements Builder<Shape>{

    private int height;
    private int width;
    private int margin;

    public BuilderShape() {
    }

    @Override
    public Builder setHeight(int height) {
        this.height = height;
        return this;
    }

    @Override
    public Builder setWidth(int width) {
        this.width = width;
        return this;
    }

    @Override
    public Builder setMargin(int margin) {
        this.margin = margin;
        return this;
    }

    @Override
    public Shape getResult() {
        return new Shape(height,width,margin);
    }


}
