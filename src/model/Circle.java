package model;
public class Circle extends Shape {
	private double radius;

	public Circle(double newRadius) {
		if (newRadius > 0) {
			this.radius = newRadius;
		} else {
			System.out.println("Radius cannot be less than or equal to 0");
		}
	}
	
	public double getArea() {
		return this.area;
	}

	@Override
	public void calculateArea() {
		this.area = Math.PI * Math.pow(this.radius, 2);
	}

	@Override
	public void drawShape() {
		int circleRadius = round(this.radius);
		
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
