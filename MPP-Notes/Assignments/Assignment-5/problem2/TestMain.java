package assignment5.problem2;

public class TestMain {

	public static void main(String[] args) {
		Shape[] shapes = {new Circle(10), new Rectangle(4,5), new Triangle(6,7)};
		
		double sumOfArea = 0.0;
		for(Shape s: shapes) {
			sumOfArea = sumOfArea + s.computeArea();
		}
		
		System.out.println("Sum of Area : "+sumOfArea);
	}

}
