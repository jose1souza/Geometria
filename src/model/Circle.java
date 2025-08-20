package model;
public class Circle{
	private double radius;
	private double area;

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
	
	public double getRadius() {
		return this.radius;
	}
	
	public int getRadiusRounded() {
		return round(this.radius);
	}
	
	public void calculateArea() {
		this.area = Math.PI * Math.pow(this.radius, 2);
	}
	
	private int round(double value) {
		int valueRounded = (int) Math.round(value);
		return valueRounded;
	}

}
