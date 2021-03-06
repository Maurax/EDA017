import java.util.Random;

public class AbsentMindedTurtle extends RaceTurtle {

	Random r;
	private int absentRate;

	public AbsentMindedTurtle(RaceWindow w, int nbr, int absentRate) {
		super(w, nbr);
		r = new Random();
		this.absentRate = absentRate;
	}

	public void raceStep() {
		if (r.nextInt(100) + 1 > absentRate)
			super.raceStep();
	}

	public String toString() {
		return super.toString() + " - AbsentMindedTurtle (" + absentRate + "% Frånvarande)";
	}

}
