package prob4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class Problem4 {
	//IMPLEMENT - you must use the reduce operation on Streams
	public static <T> ArrayList<T> combine(Stream<ArrayList<T>> stream) {
		return stream.reduce(new ArrayList<>(), (str1,str2) -> {
			str1.addAll(str2);
			return str1;
		});  
	}
	
	public boolean simple(List<Boolean> list) {
		return list.stream()
				.map(s -> s).reduce(false, (a,b) -> a || b);
	}
	
	
	public static void testCombine() {
		
		ArrayList<ArrayList<String>> mainList = new ArrayList<>();
		
		ArrayList<String> list1 = new ArrayList<String>() {
			{
				add("hello");
				add("there");
			}
		};
		
		ArrayList<String> list2 = new ArrayList<String>() {
			{
				add("goodbye");
				add("there");
			}
		};
		
		ArrayList<String> list3 = new ArrayList<String>() {
			{
				add("goodbye");
				add("there");
			}
		};
		mainList.add(list1);
		mainList.add(list2);
		mainList.add(list3);
		
		
		
		System.out.println(combine(mainList.stream()));
	}
	public static void main(String[] args) {
		testCombine();
	}
}
