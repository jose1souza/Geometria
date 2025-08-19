package project.app;

import java.util.*;
import project.model.*;

public class Main {
	private static int menu(Scanner reader) {
		System.out.println("Menu: ");
		System.out.println("1- Create Square");
		System.out.println("2- Create Rectangle");
		System.out.println("3- Create Circle");
		System.out.println("4- Create Triangle");
		System.out.println("0- Exit");
		System.out.println("Chose an option: ");
		return reader.nextInt();
	}

	public static void main(String[] args) {

		Scanner reader = new Scanner(System.in);
		int option;

		do {
			System.out.println("---------------------");
			option = menu(reader);
			switch (option) {
			case 1:
				double squareSide;

				System.out.print("Side of square: ");
				squareSide = reader.nextDouble();

				Square square = new Square(squareSide);

				square.calculateArea();
				System.out.println("Area of square: " + square.getArea());
				System.out.println("Draw form square: ");
				square.drawShape();
				break;

			case 2:
				double rectangleBase, rectangleHeight;

				System.out.print("Base of rectangle: ");
				rectangleBase = reader.nextDouble();
				System.out.print("Height of rectangle: ");
				rectangleHeight = reader.nextDouble();

				Rectangle rectangle = new Rectangle(rectangleBase, rectangleHeight);

				rectangle.calculateArea();
				System.out.println("Area of rectangle: " + rectangle.getArea());
				System.out.println("Draw form rectangle:");
				rectangle.drawShape();
				break;
			case 3:
				double radiusOfCircle;

				System.out.print("Radius of circle: ");
				radiusOfCircle = reader.nextDouble();

				Circle circle = new Circle(radiusOfCircle);

				circle.calculateArea();
				System.out.println("Area of circle: " + circle.getArea());
				System.out.println("Draw form circle:");
				circle.drawShape();
				break;
			case 4:
				double triangleBase, triangleHeight;
				System.out.println("Base of triangle:");
				triangleBase = reader.nextDouble();
				System.out.println("Height of triangle:");
				triangleHeight = reader.nextDouble();

				Triangle triangle = new Triangle(triangleBase, triangleHeight);

				triangle.calculateArea();
				System.out.println("Area of triangle:" + triangle.getArea());
				System.out.println("Draw form triangle:");
				triangle.drawShape();
				break;

			case 0:
				System.out.println("Loading to exit...");
				break;
			default:
				System.out.println("Invalid Option.");
				break;
			}
		} while (option != 0);

		reader.close();
	}
}
