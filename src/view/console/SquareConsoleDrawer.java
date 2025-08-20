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
		int sideRounded = square.getSideRounded();
		
		for (int i = 0; i < sideRounded; i++) {
			for (int j = 0; j < sideRounded; j++)
				System.out.print("*");

			System.out.println();
		}
	}
}
