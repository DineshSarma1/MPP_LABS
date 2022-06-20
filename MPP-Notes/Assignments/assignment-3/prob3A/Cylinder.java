package assignment3.prob3;

public class Cylinder {

	private double height;
	private double radius;
	
	public Cylinder(double height, double radius) {
		this.height = height;
		this.radius = radius;
	}
	
	public double getHeight() {
		return this.height;
	}
	
	public double computeVolume() {
		return height * Math.PI * radius * radius;
	}
}
