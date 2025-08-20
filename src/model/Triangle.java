package model;

public class Triangle {
	private double base;
	private double height;
	private double area;

	public Triangle(double newBase, double newHeight) {
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

	public double getHeight() {
		return this.height;
	}
	
	public int getHeightRounded() {
		return round(this.height);
	}

	public void calculateArea() {
		this.area = (this.base * this.height) / 2;
	}

	private int round(double value) {
		int valueRounded = (int) Math.round(value);
		return valueRounded;
	}

}
