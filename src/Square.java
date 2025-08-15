
public class Square {
	private double side;
	private double shape;
	
	public void calculateShape() {
		this.shape = this.side * this.side;
	}
	
	public void setSide(double side) {
		this.side = side;
	}
	
	public double getShape() {
		return this.shape;
	}
	
	public void drawShape() {
		double column = this.side;
		double line = this.side;
		for(int i = 0;i<column;i++) {
			System.out.println("*");
		for(int j = 0;i<line;i++) {
				System.out.print("*");
			}
		}
	}
}
