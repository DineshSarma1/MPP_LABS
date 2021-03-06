package prob1;

//work with this lambda expression:   (Double x, Double y, Double z) -> x * y * z < x + y

public class Problem1 {
	
	// name and type of lambda goes here
	TriPredicate<Double, Double, Double> tripredicate =
			(x, y, z) -> (x * y * z) < (x + y);
	
	// representing lambda as a method reference
	TriPredicate<Double, Double, Double> tripredicate2 =
			Problem1::getResult;
	
	private static boolean getResult(Double x, Double y, Double z) {
		return (x * y * z) < (x + y);
	}
	
	
	//representing lambda as a static nested class
	static class PrintResult implements TriPredicate<Double, Double, Double> {
		public boolean test(Double x, Double y, Double z) {
			return (x * y * z) < (x + y);
		}
	}
	
	//evaluate with Double inputs 2.1, 0.35
	public void evaluator() {
		System.out.println(tripredicate.test(2.1, 0.35, 2.0));
		System.out.println(tripredicate.test(2.1, 0.35, 2.0));
		System.out.println(tripredicate.test(2.1, 0.35, 2.0));
		
		
	}
	
	public static void main(String[] args) {
		Problem1 p = new Problem1();
		p.evaluator();
	}
	
	
}
