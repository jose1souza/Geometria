package view.console;

import model.Square;

public class SquareConsoleDrawer {
	private Square square;

	public SquareConsoleDrawer(Square square) {
		if (square == null)
			throw new IllegalArgumentException("An instance of Square is required");

		this.square = square;
	}

	public void drawSquare() {
		for (int i = 0; i < square.getSide(); i++) {
			for (int j = 0; j < square.getSide(); j++)
				System.out.print("* ");

			System.out.println();
		}
	}
}
