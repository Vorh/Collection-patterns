package structual.adapter;

/**
 * Created by vorh on 7/12/17.
 */
public class Main {

    public static void main(String[] args) {
        RoundHole roundHole = new RoundHole(5);
        RoundPeg roundPeg = new RoundPeg(5);

        if (roundHole.fits(roundPeg)){
            System.out.println("rage fits hole");
        }

        SquarePeg smallSqPeg = new SquarePeg(2);
        SquarePeg largeSqPeg = new SquarePeg(20);

        SquarePegAdapter smallAdapter = new SquarePegAdapter(smallSqPeg);
        SquarePegAdapter largeAdapter = new SquarePegAdapter(largeSqPeg);

        if (roundHole.fits(smallAdapter)) {
            System.out.println("peg fits hole ");
        }
        if (!roundHole.fits(largeAdapter)) {
            System.out.println("peg not fit hole ");
        }
    }
}
