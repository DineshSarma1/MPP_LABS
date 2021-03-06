package prob4;

import java.util.ArrayList;
import java.util.stream.Stream;

public class Problem4 {
	// IMPLEMENT - you must use the reduce operation on Streams to return the
	// elements common to all the lists

	public static <T> ArrayList<T> combine(Stream<ArrayList<T>> stream) {

		return stream.reduce((x, y) -> {
			ArrayList<T> common = new ArrayList<>();
			x.retainAll(y);
			return x;
		}).get();

//		return new ArrayList<T>();

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
		mainList.add(list1);
		mainList.add(list2);
		// output should be "there"
		System.out.println(combine(mainList.stream()));
	}

	public static void main(String[] args) {
		testCombine();
	}
}
