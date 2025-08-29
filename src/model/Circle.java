package model;
public class Circle extends Shape{
	private double radius;
	private double area;

	public Circle(String description, double newRadius) {
		super(description);
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
		return super.round(getRadius());
	}
	
	@Override
	public String getDescription() {
		return "Circle: " + super.getDescription();
	}
	
	public void calculateArea() {
		this.area = Math.PI * Math.pow(this.radius, 2);
	}

}
