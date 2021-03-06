package oldExam.prob1;

import java.util.function.BiConsumer;
import java.util.function.BiPredicate;

import oldExam.prob1.SampleProblem1.PrintSum;

//work with this lambda expression:   (Double x, Double y) -> x * y < x + y
public class Problem1 {
	// name and type of lambda goes here
	BiPredicate<Double, Double> biPredicate =
			(x, y) -> (x * y) < (x + y);
	
	// representing lambda as a method reference
	BiPredicate<Double, Double> biPredicate2 = Problem1::printResult;
	
	
	public static boolean printResult(Double t, Double u) {
		return (t*u) < (t+u);
	}
	
	//representing lambda as a static nested class
	static class PrintResult implements BiPredicate<Double, Double> {

		@Override
		public boolean test(Double t, Double u) {
			
			return (t*u) < (t+u);
		}
		
	}
	
	//evaluate with Double inputs 2.1, 0.35
	public void evaluator() {
		
		System.out.println(biPredicate.test(2.1, 0.35));
		System.out.println(biPredicate2.test(2.1,0.35));
		System.out.println((new PrintResult()).test(2.1,  0.35));
		
	}
	public static void main(String[] args) {
		Problem1 p = new Problem1();
		p.evaluator();
	}
	
	
}
