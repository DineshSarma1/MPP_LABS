package assignment3.prob3;

public class Circle extends Cylinder{
	private double radius;
	
	public Circle(double radius) {
		super(0.0,radius);
		this.radius = radius;
	}
	
	public double getRadius() {
		return this.radius;
	}
	
	public double computeArea() {
		return Math.PI * radius * radius;
	}
}
