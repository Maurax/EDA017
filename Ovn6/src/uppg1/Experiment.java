package uppg1;

public class Experiment {
	Die die1;
	Die die2;

	public Experiment(Die d1, Die d2) {
		die1 = d1;
		die2 = d2;
	}

	public int[] makeExperiment(int n) {
		int[] res = new int[12];
		for (int i = 0; i < n; i++)
			res[die1.roll() + die2.roll() - 1]++;
		return res;
	}
}
