package model;

public class Square extends  Shape{
	private double side;

	public Square(double newSide) {
		if (newSide > 0) {
			this.side = newSide;
		} else {
			System.out.println("Base cannot be less than or equal to 0");
		}
	}
	
	public double getSide() {
		return this.side;
	}
	
	public double getArea() {
		return this.area;
	}
	
	@Override
	public void calculateArea() {
		this.area = this.side * this.side;
	}

}
