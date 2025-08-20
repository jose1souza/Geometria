package model;

public abstract class Shape {
	protected double area;

	public abstract void calculateArea();

	protected int round(double value) {
		int valueRounded = (int) Math.round(value);
		return valueRounded;
	}

}
