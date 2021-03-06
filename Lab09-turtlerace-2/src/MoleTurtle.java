import java.util.Random;

public class MoleTurtle extends RaceTurtle {

	Random r;

	public MoleTurtle(RaceWindow w, int nbr) {
		super(w, nbr);
		r = new Random();
	}

	public void raceStep() {
		int dig = r.nextInt(10);
		if (dig > 6)
			penUp();
		else if (dig < 3)
			penDown();
		super.raceStep();
	}

	public String toString() {
		return super.toString() + " - MoleTurtle";
	}

}
