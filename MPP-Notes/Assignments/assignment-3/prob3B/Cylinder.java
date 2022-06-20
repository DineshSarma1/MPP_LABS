package assignment3.prob3B;

public class Cylinder {

	private double height;
	private double radius;
	private Circle circle;
	
	public Cylinder(double height, double radius) {
		this.height = height;
		this.radius = radius;
		this.circle = new Circle(radius);
	}
	
	public double getHeight() {
		return this.height;
	}
	
	public double computeVolume() {
		return height * circle.computeArea();
	}
}
