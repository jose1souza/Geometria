
public class Triangle extends Shape {
	private double base;
	private double height;

	Triangle(double newBase, double newHeight) {
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
		int column = round(this.base);
		int line = round(this.height);

		for (int i = 1; i <= line; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
