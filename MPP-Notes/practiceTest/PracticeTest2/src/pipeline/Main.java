package pipeline;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import quizclasses.Employee;
import quizclasses.EmployeeTestData;
import quizclasses.Pair;
import quizclasses.Trader;
import quizclasses.TraderTransactTestData;
import quizclasses.Transaction;

/** USE STREAM PIPELINES TO SOLVE THE PROBLEMS HERE */
public class Main {
	@SuppressWarnings("serial")
	public static void main(String[] args) {
		System.out.println("Sample Query");
		List<Employee> sampleData = EmployeeTestData.getList();
		// SAMPLE: Create a stream pipeline that does the following:
		// Print all Employee records for which name has length > 5 and birth year is >
		// 1970
		List<Employee> result = sampleData.stream().filter(e -> e.getName().length() > 5)
				.filter(e -> e.getYearOfBirth() > 1970).collect(Collectors.toList());
		System.out.println(result);

		prob1();
		prob2();
		prob3();
	}

	// Create a stream pipeline that obtains a list of
	// all name/salary pairs extracted from a list of Employees
	// for which salary > 55000 and less than 120000, in ascending
	// order of name, then descending order of salary
	// Then print the list to the console
	public static void prob1() {
		// use this list
		List<Employee> list = EmployeeTestData.getList();
		List<Pair> result = list.stream()
				.filter(emp -> emp.getSalary() > 55000 && emp.getSalary() < 120000)
				.sorted(Comparator.comparing(Employee::getName)
						.thenComparing(Employee::getSalary,Comparator.reverseOrder()))
				.map(e -> new Pair(e.getName(), e.getSalary())).collect(Collectors.toList());

		System.out.println("\nproblem1 output : \n" + result + "\n");

	}

	// Create a stream pipeline to find all transactions from year 2011
	// and sort them by value (small to high), and print to console
	// (Note: there is an instance variable "value" in Transaction)
	public static void prob2() {
		// use this list
		List<Transaction> list = TraderTransactTestData.getTransactions();
		List<Transaction> result = list.stream().filter(trans -> trans.getYear() == 2011)
				.sorted(Comparator.comparing(Transaction::getValue)).collect(Collectors.toList());

		System.out.println("problem2 output : \n" + result + "\n");
	}

	// Create a stream pipeline to find all traders from Cambridge,
	// sort them by name, and print to console
	public static void prob3() {
		// Use this list
		List<Transaction> list = TraderTransactTestData.getTransactions();

		List<Trader> result = list.stream()
				.filter(t -> t.getTrader().getCity().equals("Cambridge"))
				.distinct()
				.map(Transaction::getTrader)
				.sorted(Comparator.comparing(Trader::getName))
				.collect(Collectors.toList());

		System.out.println("problem3 output : \n" + result + "\n");

	}
}
