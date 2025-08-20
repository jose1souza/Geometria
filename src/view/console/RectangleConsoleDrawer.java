package view.console;

import model.Rectangle;

public class RectangleConsoleDrawer {
	private Rectangle rectangle;
	
	public RectangleConsoleDrawer(Rectangle rectangle) {
		if (rectangle == null)
			throw new IllegalArgumentException("An instance of Rectangle is required");

		this.rectangle = rectangle;
	}
	
	public void drawRectangle() {
		int column = rectangle.getBaseRounded();
		int line = rectangle.getHeightRounded();

		for (int i = 0; i < line; i++) {
			for (int j = 0; j < column; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
