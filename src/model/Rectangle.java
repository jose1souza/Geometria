package model;
public class Rectangle{
	private double base;
	private double height;
	private double area;

	public Rectangle(double newBase, double newHeight) {
		if (newBase > 0 && newHeight > 0) {
			this.base = newBase;
			this.height = newHeight;
		} else {
			System.out.println("Side and Height cannot be less than or equal to 0");
		}
	}

	public double getArea() {
		return this.area;
	}
	
	public double getBase() {
		return this.base;
	}
	
	public double getHeight() {
		return this.height;
	}
	
	public int getBaseRounded() {
		return round(this.base);
	}
	
	public int getHeightRounded() {
		return round(this.height);
	}

	public void calculateArea() {
		this.area = this.base * this.height;
	}
	
	public int round(double value) {
		int valueRounded = (int) Math.round(value);
		return valueRounded;
	}

}
