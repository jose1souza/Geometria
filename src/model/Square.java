package model;

public class Square{
	private double side;
	private double area;

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
	
	public int getSideRounded() {
		return round(this.side);
	}
	
	public void calculateArea() {
		this.area = this.side * this.side;
	}
	
	public int round(double value) {
		int valueRounded = (int) Math.round(value);
		return valueRounded;
	}

}
