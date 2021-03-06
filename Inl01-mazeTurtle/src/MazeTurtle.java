import java.util.Scanner;

import se.lth.cs.pt.maze.Maze;
import se.lth.cs.pt.window.SimpleWindow;

public class MazeTurtle {
	private Turtle t;
	private SimpleWindow w;

	public MazeTurtle(Turtle turtle, SimpleWindow w) {
		t = turtle;
		this.w = w;
		t.penDown();
	}

	public void walk(Maze m) {
		m.draw(w);
		t.jumpTo(m.getXEntry(), m.getYEntry());
		int steps = 0;
		while (!m.atExit(t.getX(), t.getY())) {
			if (m.wallAtLeft(t.getDirection(), t.getX(), t.getY())
					&& m.wallInFront(t.getDirection(), t.getX(), t.getY()))
				t.left(-90);
			else if (m.wallAtLeft(t.getDirection(), t.getX(), t.getY())) {
				t.forward(1);
				steps++;
			} else {
				t.left(90);
				t.forward(1);
				steps++;
			}
			Maze.delay(20);
		}
		System.out.println("Sköldpaddan kom i mål efter " + steps + " steg!");
	}

	public static void main(String[] args) {
		SimpleWindow w = new SimpleWindow(500, 500, "The aMAZEing turtle");
		Turtle t = new Turtle(w, 0, 0);
		MazeTurtle mt = new MazeTurtle(t, w);
		Scanner s = new Scanner(System.in);
		System.out.println("Vilken labyrint vill du prova?");
		int n = s.nextInt();
		mt.walk(new Maze(n));
	}

}
