
public class Circle extends Shape {

	private Point center;
	private double radius;

	public Circle(double a, double b, double radius) {
		super("Circle");
		this.center = new Point(a, b);
		this.radius = radius;
	}
	
	//Getter and Setter of center and radius
	public Point getcenter() {
		return center;
	}

	public void setcenter(Point center) {
		this.center = center;
	}

	public double getRadius() {
		return this.radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	//the formula of Circle Area
	public double getArea() {
		return Math.PI * this.radius * this.radius;
	}
	//Show the reuslt to user
	public String toString() {
		return "Center = " + this.center.toString() + "Radius = " + this.radius;
	}

}
