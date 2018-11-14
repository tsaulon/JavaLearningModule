package W4;

public class Circle extends GeometricObject {

	private double radius;
	
	Circle() {
		super();
		this.radius = 0;
	}
	
	Circle(double radius) {
		super();
		this.radius = radius;
	}
	
	Circle(double radius, String color, boolean filled) {
		super(color, filled);
		this.radius = radius;
	}
	
	public double getRadius() {
		return this.radius;
	}
	
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public String toString() {
		return super.toString() + ", radius: " + this.getRadius();
	}
	
	@Override
	double getArea() {
		return Math.PI * Math.pow(this.radius, 2);
	}

	@Override
	double getParameter() {
		return 2 * Math.PI * this.radius;
	}

}
