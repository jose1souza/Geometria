package model;
public class Rectangle extends Shape{
	private double base;
	private double height;
	private double area;

	public Rectangle(String description,double newBase, double newHeight) {
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
		return super.round(this.height);
	}
	
	@Override
	public String getDescription() {
		return "Rectangle: " + super.getDescription();
	}

	public void calculateArea() {
		this.area = this.base * this.height;
	}

}
