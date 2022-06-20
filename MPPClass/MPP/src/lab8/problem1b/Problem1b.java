package lab8.problem1b;

import java.util.function.Supplier;

public class Problem1b {
	public static void main(String[] args) {
		
		Supplier<Double> random = Math::random;
		System.out.println(random.get().doubleValue());
		System.out.println(new Problem1b().new MyMath().get());
	}

	class MyMath implements Supplier<Double>{
		@Override
		public Double get() {
			return Math.random();
		}
	}
}
