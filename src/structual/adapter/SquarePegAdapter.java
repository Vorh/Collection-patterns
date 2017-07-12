package structual.adapter;

/**
 * Created by vorh on 7/12/17.
 */
public class SquarePegAdapter extends RoundPeg {

    private SquarePeg squarePeg;

    public SquarePegAdapter(SquarePeg squarePeg){
        this.squarePeg = squarePeg;
    }

    @Override
    public double getRadius() {
        double radius;
        return  radius = (Math.sqrt(Math.pow((squarePeg.getRadius()/2),2)*2));
    }
}
