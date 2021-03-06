package life;

public class LifeBoard {
	private boolean[][] board;
	int gen;

	/**
	 * Skapar en spelplan med rows rader och cols kolonner. Spelplanen är från
	 * början tom, dvs alla rutorna är tomma och generationsräknaren är 1.
	 */
	public LifeBoard(int rows, int cols) {
		board = new boolean[rows][cols];
		gen = 1;
	}

	/**
	 * Undersöker om det finns en individ i rutan med index row,col, Om index
	 * row,col hamnar utanför spelplanen returneras false.
	 */
	public boolean get(int row, int col) {
		return isValid(row, col) && board[row][col];
	}

	/** Lagrar värdet val i rutan med index row,col. */
	public void put(int row, int col, boolean val) {
		if (isValid(row, col))
			board[row][col] = val;
	}

	/** Tar reda på antalet rader. */
	public int getRows() {
		return board.length;
	}

	/** Tar reda på antalet kolonner. */
	public int getCols() {
		return board[0].length;
	}

	/** Tar reda på aktuellt generationsnummer. */
	public int getGeneration() {
		return gen;
	}

	/** Ökar generationsnumret med ett. */
	public void increaseGeneration() {
		gen++;
	}

	public boolean isValid(int row, int col) {
		return row < board.length && col < board[0].length && row >= 0 && col >= 0;
	}
}
