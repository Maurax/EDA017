package uppg3;

public class Main {
	public static void main(String[] args) {
		System.out.println(reverse("abcdef"));
	}

	public static String reverse(String s) {
		StringBuilder res = new StringBuilder();
		for (int i = s.length() - 1; i >= 0; i--)
			res.append(s.charAt(i));
		return res.toString();
	}
}
