package project.model;

public class Triangle extends Shape {
	private double base;
	private double height;

	public Triangle(double newBase, double newHeight) {
		if (newBase > 0 && newHeight > 0) {
			this.base = newBase;
			this.height = newHeight;
		} else {
			System.out.println("Side and Height cannot be less than or equal to 0");
		}
	}

	/*public void setBase(double base) {
		this.base = base;
	}*/

	public double getArea() {
		return this.area;
	}

	@Override
	public void calculateArea() {
		this.area = (this.base * this.height) / 2;
	}

	@Override
	public void drawShape() {
		int height = round(this.height);

		for (int lineController = 1; lineController <= height; lineController++) {
			for (int asterisks = 1; asterisks <= lineController; asterisks++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
