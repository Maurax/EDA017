import java.util.Random;

public class DizzyTurtle extends RaceTurtle {

	Random r;
	int dizzyRate;

	public DizzyTurtle(RaceWindow w, int nbr, int dizzyRate) {
		super(w, nbr);
		r = new Random();
		this.dizzyRate = dizzyRate;
	}

	public void raceStep() {
		left(dizzyRate * (r.nextInt(3) - 1));
		super.raceStep();
	}

	public String toString() {
		return super.toString() + " - DizzyTurtle (Yrsel: " + dizzyRate + ")";
	}

}
