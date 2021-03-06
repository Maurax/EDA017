import java.util.Scanner;

public class GuessGame {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int guess;

		System.out.println("Skriv min- och maxvärde alla gissa mellan:");
		int min = s.nextInt();
		int max = s.nextInt();
		NumberToGuess n = new NumberToGuess(min, max);
		System.out.println("Gissa på ett tal:");
		guess = s.nextInt();
		int i = 1;
		for (; !n.isEqual(guess); i++) {
			if (n.isBiggerThan(guess))
				System.out.println("För litet, gissa igen!");
			else
				System.out.println("För stort, gissa igen!");
			guess = s.nextInt();
		}
		System.out.println("Grattis. du gissade rätt på " + i + " försök");
		System.out.println("OptimalGuesser klarade det på " + OptimalGuesser.nbrGuesses(n) + " försök");

	}
}
