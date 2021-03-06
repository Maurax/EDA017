package life;

public class LifeController {
	public static void main(String[] args) {
		LifeBoard board = new LifeBoard(19, 19);
		LifeView window = new LifeView(board);
		window.drawBoard();
		Life l = new Life(board);
		while (true) {
			int c = window.getCommand();
			if (c == 1)
				l.flip(window.getRow(), window.getCol());
			else if (c == 2)
				l.newGeneration();
			else if (c == 3)
				System.exit(0);
			window.update();
		}
	}
}
