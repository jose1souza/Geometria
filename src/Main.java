import java.util.*;

public class Main {
	public static void main(String[] args) {
		Square q1 = new Square();
		Scanner read = new Scanner(System.in);
		double q1Side;
		
		System.out.print("Side: ");
		q1Side = read.nextDouble();
		q1.setSide(q1Side);
		q1.calculateShape();
		System.out.print("Shape: ");
		System.out.print(q1.getShape());
		q1.drawShape();
	}
}
