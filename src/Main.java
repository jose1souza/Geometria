import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		double squareSide;

		System.out.print("Side: ");
		squareSide = reader.nextDouble();
		
		Square square = new Square(squareSide);
		
		square.calculateShape();
		System.out.println("Shape: " + square.getShape());
		System.out.println("Draw form: ");
		square.drawShape();
	}
}
