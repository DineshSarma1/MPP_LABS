package oldExam.prob5;

import java.time.LocalDate;
import java.util.*;

public class Test {
	public static void main(String[] args) {
		testIntegers();
		testStrings();
		testEmployees();
		testLocalDates();
	}
	
	public static void testIntegers() {
		List<Integer> ints = Arrays.asList(4, 8, -2);
		List<Pair<Integer, Integer>> pairList = AllPairs.allIncreasingPairs(ints);
		System.out.println("integer output : \n"+pairList);
	}
	
	public static void testStrings() {
		 List<String> strs = Arrays.asList("Bob", "Alice", "Steve");
		 //uncomment when ready
		 List<Pair<String, String>> pairList = AllPairs.allIncreaseingPairs2(strs,(s1,s2) -> s1.compareTo(s2));
		 System.out.println("String output : \n"+pairList);
		 
	}
	
	public static void testLocalDates() {
		
		 List<LocalDate> dates = Arrays.asList(LocalDate.of(1994, 1, 2), 
				 LocalDate.of(2003, 9, 11), LocalDate.of(2001, 4, 15));
		 //uncomment when ready
		 List<Pair<LocalDate, LocalDate>> pairList = AllPairs.allIncreaseingPairs2(dates,(d1,d2) -> d1.compareTo(d2));
		 System.out.println("Local date output : \n"+pairList);
		 
	}
	
	
	
	public static void testEmployees() {		
		 List<Employee> emps = Arrays.asList(new Employee("Bob", 100000), new Employee("Jim", 55000), 
				 new Employee("Adrian", 90000), new Employee("Jim", 60000));
		 //complete implementation of test when ready
		 
		 List<Pair<Employee, Employee>> pairList = AllPairs.allIncreaseingPairs2(emps,
				 Comparator.comparing((Employee e) -> e.getName()).thenComparing(Employee::getSalary));
		 System.out.println("Employee output : \n"+pairList);
		 
	}
	
	
}
