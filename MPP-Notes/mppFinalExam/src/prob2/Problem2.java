package prob2;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.List;

import helperclasses.CheckoutRecordEntry;
import helperclasses.TestData;

/*
 * Print to the console the list of book titles – in sorted order -- 
 * for which the book was checked out on June 27, 2015. 
 * The ordering of the book titles is as follows: First sort by the length descending
 * of the title ( smaller number of characters first), then by reverse of the title 
 * (“yza” combes before “axb” because sorting is on the reverse of the title ) .  
 */
public class Problem2 {

	public static Comparator<String> REVERSE_COMPARE = (o1, o2) -> {

		StringBuilder sb1 = new StringBuilder(o1);
		String reversed1 = sb1.reverse().toString();

		StringBuilder sb2 = new StringBuilder(o2);
		String reversed2 = sb2.reverse().toString();

		return reversed1.compareTo(reversed2);
	};

	public static void main(String[] args) {
		// use this list Hint: create 6/27/2015 like this: LocalDate.of(2015, 6, 27)
		List<CheckoutRecordEntry> list = TestData.INSTANCE.getAllEntries();

//		Test the function
		reverseCompareTest("axb", "xza");

		list.stream().filter(x -> x.getCheckoutDate().equals(LocalDate.of(2015, 6, 27)))
				.map(x -> x.getCopy().getBook().getTitle())
				.sorted(Comparator.comparing(String::length).thenComparing(REVERSE_COMPARE))
				.forEach(System.out::println);
	}

	public static void reverseCompareTest(String a, String b) {

		if (REVERSE_COMPARE.compare(a, b) > 0) {
			System.out.println(b + " comes before " + a);
		}
		if (REVERSE_COMPARE.compare(a, b) < 0) {
			System.out.println(a + " comes before  " + b);
		}
		if (REVERSE_COMPARE.compare(a, b) == 0) {
			System.out.println(a + " equals " + b);
		}

	}

}
