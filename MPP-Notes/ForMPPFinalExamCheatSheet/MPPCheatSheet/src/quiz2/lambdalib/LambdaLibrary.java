package quiz2.lambdalib;

import java.util.Comparator;
import java.util.List;
import java.util.function.BiFunction;
import java.util.stream.Collectors;

import quiz2.quizclasses.Employee;
import quiz2.quizclasses.Pair;
import quiz2.quizclasses.Trader;
import quiz2.quizclasses.Transaction;

public class LambdaLibrary {
	public final static String IMPLEMENT = "implement!";

	// sample query
	public final static TriFunction<List<Employee>, Integer, Integer, List<Employee>> SAMPLE 
	= (list, namelength,year) -> list.stream()
					.filter(e -> e.getName().length() > namelength).filter(e -> e.getYearOfBirth() > year)
					.collect(Collectors.toList());

	// problem1 query
	public final static TriFunction<List<Employee>, Integer, Integer, List<Pair>> PROBLEM1RESULT 
	= (list, lower,upper) -> list.stream()
			.filter(emp -> emp.getSalary() > lower && emp.getSalary() < upper)
					.sorted(Comparator.comparing(Employee::getName).thenComparing(Employee::getSalary,
							Comparator.reverseOrder()))
					.map(e -> new Pair(e.getName(), e.getSalary())).collect(Collectors.toList());
	
	//problem2 query
	public final static BiFunction<List<Transaction>, Integer, List<Transaction>> PROBLEM2RESULT 
	= (list, year) -> list.stream()
						.filter(trans -> trans.getYear() == year)
						.sorted(Comparator.comparing(Transaction::getValue))
						.collect(Collectors.toList());
	
	//problem3 query
	public final static BiFunction<List<Transaction>, String, List<Trader>> PROBLEM3RESULT 
	= (list, cityName) -> list.stream()
					.filter(t -> t.getTrader().getCity().equals(cityName))
					.distinct()
					.map(Transaction::getTrader)
					.sorted(Comparator.comparing(Trader::getName))
					.collect(Collectors.toList());

}
