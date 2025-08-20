package view.console;

import model.Triangle;

public class TriangleConsoleDrawer {
	private Triangle triangle;

	public TriangleConsoleDrawer(Triangle triangle) {
		if (triangle == null)
			throw new IllegalArgumentException("An instance of Triangle is required");

		this.triangle = triangle;
	}

	public void drawTriangle() {
		int height = triangle.getHeightRounded();

		for (int lineController = 1; lineController <= height; lineController++) {
			for (int asterisks = 1; asterisks <= lineController; asterisks++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
