package view.console;

import model.Circle;

public class CircleConsoleDrawer {
	private Circle circle;

	public CircleConsoleDrawer(Circle circle) {
		if (circle == null)
			throw new IllegalArgumentException("An instance of Circle is required");

		this.circle = circle;
	}

	public void drawCircle() {
		int circleRadius = circle.getRadiusRounded();

		for (int axisX = -circleRadius; axisX < circleRadius; axisX++) {
			for (int axisY = -circleRadius; axisY < circleRadius; axisY++) {
				if (Math.pow(axisX, 2) + Math.pow(axisY, 2) <= Math.pow(circleRadius, 2)) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
