
public class SolitaireProb {
	public static void main(String[] args) {
		CardDeck deck = new CardDeck();
		int n = 100000; // number of times to run simulation
		int success = 0;
		for (int j = 0; j < n; j++) {
			deck.shuffle();
			int i = 0;
			while (deck.moreCards()) {
				if (deck.getCard().getRank() == (i % 3) + 1) {
					break;
				}
				i++;
			}
			if (i == 52)
				success++;

		}
		double prob = (double) success / n;
		System.out.println("Sannolikheten att lyckas är ungefär " + prob);
	}
}
