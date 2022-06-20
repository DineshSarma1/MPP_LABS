package lesson11.labs.prob2;

import java.util.Arrays;
import java.util.List;

import lesson11.labs.prob3.Employee;

public class Main {

	public static void main(String[] args) {
		List<String> strings = List.of("A","B","C","D");
		List<Integer> integers = List.of(1,2,3,4);
		List<Double> doubles = List.of(1.0,2.0,3.0,4.0);
		
		System.out.println(secondSmallestHelper(strings));
		System.out.println(secondSmallestHelper(integers));
		System.out.println(secondSmallestHelper(doubles));

	}

	public static Object secondSmallest(List<?> list) {
		return secondSmallestHelper(list);
	}
	
	public static <T> T secondSmallestHelper(List<T> list){
		return list.stream().sorted().skip(list.size() > 1 ? 1 : 0).findFirst().get();
		
	}
}