
public class Square extends  Shape{
	private double base;

	Square(double newSide) {
		if (newSide > 0) {
			this.base = newSide;
		} else {
			System.out.println("Base cannot be less than or equal to 0");
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
		this.area = this.base * this.base;
	}

	@Override
	public void drawShape() {
		int column = round(this.base);
		int line = round(this.base);

		for (int i = 0; i < line; i++) {
			for (int j = 0; j < column; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
