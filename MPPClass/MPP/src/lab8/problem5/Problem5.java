package lab8.problem5;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;


public class Problem5 {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		List<String> list = Arrays.asList("Hello there", "Goodbye", "Back soon", 
				"Away", "On Vacation", "Everywhere you want to be");
	
		MyConsumer myConsumer = new Problem5().new MyConsumer();
		list.forEach(myConsumer::accept);
			
	}
	
	//implement a Consumer
	class MyConsumer implements Consumer<String>{
		@Override
		public void accept(String t) {
			System.out.println(t.toUpperCase());
		}
	}
}