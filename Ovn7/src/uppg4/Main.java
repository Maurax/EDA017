package uppg4;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		String w = "Attack!";
		long key = 5;
		System.out.println(w + " = " + encrypt(w, key));
	}

	public static String encrypt(String plainText, long key) {
		Random r = new Random(key);
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < plainText.length(); i++) {
			char c = (char) (plainText.charAt(i) + r.nextInt() % 256);
			sb.append(c);
		}
		return sb.toString();
	}
}
