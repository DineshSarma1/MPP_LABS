package prob1;

import java.util.function.BiPredicate;

//work with this lambda expression:   (Double x, Double y) -> x * y < x + y
public class Problem1 {
	// name and type of lambda goes here
	BiPredicate<Double,Double > bi=(x,y)->x * y < x + y;
	
	
	// representing lambda as a method reference
	BiPredicate<Double,Double> bi1=Problem1::checkDouble;
	
	private static boolean checkDouble(Double x,Double y) {
		return x * y < x + y;
		
	}
	
	
	
	//representing lambda as a static nested class
	static class Check implements BiPredicate<Double,Double>{
		
		@Override
		public boolean test(Double x, Double y) {
			
         return x*y <x+y;		}
		
		
	}
	
	//evaluate with Double inputs 2.1, 0.35
	public void evaluator() {
   System.out.println(bi.test(2.1, 0.35));		
   System.out.println(bi1.test(2.1, 0.35));	
   System.out.println(new Check().test(2.1, 0.35));	
		
	}
	public static void main(String[] args) {
		Problem1 p = new Problem1();
		p.evaluator();
	}
	
	
}
