import java.util.ArrayList;
import java.util.Random;

public class TurtleRace {
	ArrayList<RaceTurtle> turtles;
	ArrayList<RaceTurtle> finished;
	RaceWindow w;

	public TurtleRace(RaceWindow w) {
		this.w = w;
		turtles = new ArrayList<RaceTurtle>();
		finished = new ArrayList<RaceTurtle>();
		Random r = new Random();
		for (int i = 1; i <= 8; i++)
			switch (r.nextInt(3)) {
			case 0:
				turtles.add(new MoleTurtle(w, i));
				System.out.println(turtles.get(i - 1));
				break;
			case 1:
				turtles.add(new AbsentMindedTurtle(w, i, r.nextInt(101)));
				System.out.println(turtles.get(i - 1));
				break;
			case 2:
				turtles.add(new DizzyTurtle(w, i, r.nextInt(5) + 1));
				System.out.println(turtles.get(i - 1));
				break;
			}

	}

	public void race() {
		while (!turtles.isEmpty()) {
			for (int i = 0; i < turtles.size(); i++) {
				RaceTurtle current = turtles.get(i);
				current.raceStep();
				if (current.getX() > RaceWindow.X_END_POS) {
					finished.add(current);
					turtles.remove(i);
					i--;
				}
			}
			RaceWindow.delay(10);
		}

		for (int i = 0; i < 3; i++)
			System.out.println("På plats " + (i + 1) + ": " + finished.get(i));
	}

	public static void main(String[] args) {
		RaceWindow w = new RaceWindow();
		TurtleRace t = new TurtleRace(w);
		t.race();
	}

}
