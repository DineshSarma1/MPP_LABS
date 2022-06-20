package assignment5.problem2;

final public class Rectangle implements Shape{
	
	private double width;
	private double length;
	
	public Rectangle(double width, double length) {
		this.width = width;
		this.length = length;
	}

	@Override
	public double computeArea() {
		
		return width * length;
	}

	public double getWidth() {
		return width;
	}

	public double getLength() {
		return length;
	}
	
	
}
