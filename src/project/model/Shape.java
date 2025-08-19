package project.model;

public abstract class Shape {
	protected double area;

	public abstract void calculateArea();
	public abstract void drawShape();

	protected int round(double value) {
		int valueRounded = (int) Math.round(value);
		return valueRounded;
	}

}
