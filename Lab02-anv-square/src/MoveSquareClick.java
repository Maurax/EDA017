import se.lth.cs.pt.square.Square;
import se.lth.cs.pt.window.SimpleWindow;

public class MoveSquareClick {
	public static void main(String[] args) {
		SimpleWindow w = new SimpleWindow(600, 600, "MoveSquare");
		Square sq = new Square(250, 250, 100);
		sq.draw(w);
		while (true) {
			w.waitForMouseClick();
			int x = w.getMouseX() - sq.getX();
			int y = w.getMouseY() - sq.getY();
			for (int i = 0; i < 10; i++) {
				sq.move(x / 10, y / 10);
				sq.draw(w);
			}

		}
	}
}
