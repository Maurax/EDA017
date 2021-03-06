public class NumberToGuess {

	private int min; // minimum för intervallet
	private int max; // maximum för intervallet
	private int number; // nummret att gissa

	/**
	 * Skapar ett objekt med ett slumpmässigt valt heltal i intervallet [min,
	 * max].
	 */
	public NumberToGuess(int min, int max) {
		this.min = min;
		this.max = max;
		// number = new Random().nextInt(max - min + 1) + min;
		number = 10;
	}

	/** Tag reda på minsta möjliga värde talet kan ha. */
	public int getMin() {
		return min;
	}

	/** Tag reda på största möjliga värde talet kan ha. */
	public int getMax() {
		return max;
	}

	/** Tar reda på om talet är lika med guess. */
	public boolean isEqual(int guess) {
		return guess == number;
	}

	/** Tar reda på om talet är större än guess. */
	public boolean isBiggerThan(int guess) {
		return guess < number;
	}
}
