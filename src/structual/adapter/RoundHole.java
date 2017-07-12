package structual.adapter;

/**
 * Created by vorh on 7/12/17.
 */
public class RoundHole {

    private double radius;

    public RoundHole(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public boolean fits(RoundPeg roundPeg){
        boolean result;

        result = (getRadius() >= roundPeg.getRadius());
        return result;
    }
}
