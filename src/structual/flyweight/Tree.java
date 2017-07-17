package structual.flyweight;

import java.awt.*;

/**
 * Created by vorh on 7/17/17.
 */
public class Tree {
    private int x;
    private int y;
    private TreeType type;

    public Tree(int x, int y, TreeType type) {
        this.x = x;
        this.y = y;
        this.type = type;
    }
    public void draw(Graphics g){
        type.draw(g,x,y);
    }
}
