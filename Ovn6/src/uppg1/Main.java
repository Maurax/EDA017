package uppg1;

public class Main {
	public static void main(String[] args) {
		Experiment e = new Experiment(new Die(), new Die());
		int[] res = e.makeExperiment(1000);
		for (int i = 0; i < res.length; i++)
			System.out.println(i + 1 + ": " + res[i]);
	}
}
