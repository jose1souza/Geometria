package model;

public class Triangle extends Shape{
	private double base;
	private double height;
	private double area;

	public Triangle(String description, double newBase, double newHeight) {
		super(description);
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
		return super.round(this.height);
	}
	
	@Override
	public String getDescription() {
		return "Triangle: " + super.getDescription();
	}

	public void calculateArea() {
		this.area = (this.base * this.height) / 2;
	}

}
