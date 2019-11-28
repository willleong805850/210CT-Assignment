
public class Square extends Shape {

	private Point topLeft;
	private double width;

	public Square(double a, double b, double w) {
		super("Square");
		this.width = w;
		this.topLeft = new Point(a, b);
	}
	//Getter and Setter of topLeft and width
	public Point getTopLeft() {
		return topLeft;
	}

	public void setTopLeft(Point topLeft) {
		this.topLeft = topLeft;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}
	//the formula of Square Area
	public double getArea() {
		return this.width * this.width;
	}
	//Show the reuslt to user
	public String toString() {
		return "TopLeft = " + this.topLeft.toString() + "; Width = " + this.width;
	}
}