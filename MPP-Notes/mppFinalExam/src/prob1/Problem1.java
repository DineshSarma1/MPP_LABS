package prob1;

//work with this lambda expression: (Double x, Double y, Double z) -> x * y * z < x + y

public class Problem1 {

// name and type of lambda goes here

	TriFunction<Double, Double, Double, Boolean> triLambda = (x, y, z) -> x * y * z < x + y;

// representing lambda as a method reference

	TriFunction<Double, Double, Double, Boolean> functionMethodRefrence = Problem1::myMethod;

	private static boolean myMethod(Double d1, Double d2, Double d3) {
		return d1 * d2 * d3 < d1 + d2;
	}

// representing lambda as a static nested class

	static class staticNestedClass implements TriFunction<Double, Double, Double, Boolean> {

		@Override
		public Boolean apply(Double a, Double b, Double c) {
			return a * b * c < a + b;
		}

	}

// evaluate with Double inputs 2.1, 0.35
	public void evaluator() {
		System.out.println("Lambda result:" + triLambda.apply(2.1, 0.35, 0.5));
		System.out.println("Method reference:" + functionMethodRefrence.apply(2.1, 0.35, 0.5));
		System.out.println("Nested result :" + new staticNestedClass().apply(2.1, 0.35, 0.5));

	}

	static boolean sumOfNum(double x, double y) {
		return x * y < x + y;
	}

	public static void main(String[] args) {
		Problem1 p = new Problem1();
		p.evaluator();
	}

}