package structual.composite;

import java.awt.*;

/**
 * Created by vorh on 7/14/17.
 */
public class Circle extends BaseShape{

    private int radius;

    public Circle(int x, int y,int radius,Color color) {
        super(x, y, color);
        this.radius = radius;
    }

    @Override
    public int getWidth() {
        return radius * 2;
    }

    @Override
    public int getHeight() {
        return radius * 2;
    }

    @Override
    public void paint(Graphics graphics) {
        super.paint(graphics);
        graphics.fillOval(x,y,getWidth()-1,getHeight()-1);
    }
}
