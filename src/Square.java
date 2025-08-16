
public class Square {
	private double side;
	private double shape;

	Square(double newSide) {
		if (newSide > 0) {
			this.side = newSide;
		} else {
			System.out.println("Side cannot be less than or equal to 0");
		}
	}

	public void setSide(double side) {
		this.side = side;
	}

	public double getShape() {
		return this.shape;
	}

	public void calculateShape() {
		this.shape = this.side * this.side;
	}
	
	public int roundSide(double shape) {
		int roundedSide = (int) Math.round(shape);
			return roundedSide;
	}

	public void drawShape() {
		double column = roundSide(this.side);
		double line = roundSide(this.side);

		for (int i = 0; i < line; i++) {
			for (int j = 0; j < column; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
