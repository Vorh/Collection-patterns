package structual.composite;

import java.awt.*;

/**
 * Created by vorh on 7/14/17.
 */
public interface Shape {

    int getX();
    int getY();
    int getWidth();
    int getHeight();
    void move(int x , int y);
    boolean isInsideBounds(int x, int y);
    void select();
    void unSelect();
    boolean isSelected();
    void paint(Graphics graphics);
}
