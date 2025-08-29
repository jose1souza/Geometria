package model;

public abstract class Shape {
	protected double area;
	private String description;
	
	public Shape(String description) {
		if("".equals(description))
			throw new IllegalArgumentException("The description cannot be empty.");
		
		this.description = description;
	}
	
	public String getDescription() {
		return this.description;
	}

	public abstract void calculateArea();

	protected int round(double value) {
		int valueRounded = (int) Math.round(value);
		return valueRounded;
	}

}
