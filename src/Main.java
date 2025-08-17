import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		double squareSide, rectangleBase, rectangleHeight,
			radiusOfCircle,triangleBase,triangleHeight;

		System.out.print("Side of square: ");
		squareSide = reader.nextDouble();

		Square mainSquare = new Square(squareSide);

		mainSquare.calculateArea();
		System.out.println("Area of square: " + mainSquare.getArea());
		System.out.println("Draw form square: ");
		mainSquare.drawShape();

		System.out.print("Base of rectangle: ");
		rectangleBase = reader.nextDouble();
		System.out.print("Height of rectangle: ");
		rectangleHeight = reader.nextDouble();

		Rectangle mainRectangle = new Rectangle(rectangleBase, rectangleHeight);

		mainRectangle.calculateArea();
		System.out.println("Area of rectangle: " + mainRectangle.getArea());
		System.out.println("Draw form rectangle:");
		mainRectangle.drawShape();

		System.out.print("Radius of circle: ");
		radiusOfCircle = reader.nextDouble();

		Circle mainCircle = new Circle(radiusOfCircle);
		
		mainCircle.calculateArea();
		System.out.println("Area of circle: " + mainCircle.getArea());
		System.out.println("Draw form circle:");
		mainCircle.drawShape();
		
		System.out.println("Base of triangle:");
		triangleBase = reader.nextDouble();
		System.out.println("Height of triangle:");
		triangleHeight = reader.nextDouble();
		
		Triangle mainTriangle = new Triangle(triangleBase,triangleHeight);
		
		mainTriangle.calculateArea();
		System.out.println("Area of triangle:");
		System.out.println("Draw form triangle:");
		mainTriangle.drawShape();
		
	}
}
