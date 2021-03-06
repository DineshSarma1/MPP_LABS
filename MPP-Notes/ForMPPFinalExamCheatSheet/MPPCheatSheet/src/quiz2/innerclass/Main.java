package quiz2.innerclass;

import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import quiz2.quizclasses.Employee;
import quiz2.quizclasses.EmployeeTestData;
import quiz2.quizclasses.Pair;
import quiz2.quizclasses.Trader;
import quiz2.quizclasses.TraderTransactTestData;
import quiz2.quizclasses.Transaction;

/** SOLVE THE PROBLEMS HERE BY REPLACING LAMBDA EXPRESSIONS IN YOUR PIPELINE SOLUTIONS 
 *  WITH LOCAL INNER CLASSES
 *
 */
public class Main {
	public static void main(String[] args) {
		
		//SAMPLE: Use local inner classes to replace lambdas in your pipeline solution to 
		//this sample problem:
		//Print all Employee records for which name has length > 5 and birth year is > 1970
		
		class NameLength implements Predicate<Employee> {
			public boolean test(Employee e) {
				return e.getName().length() > 5;
			}
		}
		class BirthYear implements Predicate<Employee> {
			public boolean test(Employee e) {
				return e.getYearOfBirth() > 1970;
			}
		}
		System.out.println("Sample Query");
		List<Employee> sampleData = EmployeeTestData.getList();
		
		List<Employee> result = sampleData.stream()
							        .filter(new NameLength())
							        .filter(new BirthYear())
							        .collect(Collectors.toList());
		System.out.println(result);
				
		prob1();
		prob2();
		prob3();
	}
	
	//Transform your pipeline solution to prob1 in the pipeline package so that
	//every lambda is replaced by an instance of a
	//local inner class of the correct type
	public static void prob1() {
		// use this list
		
		class SalaryPredicate implements Predicate<Employee> {
			public boolean test(Employee emp) {
				return emp.getSalary() > 55000 && emp.getSalary() < 120000;
			}
		}
		
		List<Employee> list = EmployeeTestData.getList();
		List<Pair> result = list.stream().filter(new SalaryPredicate())
				.sorted(Comparator.comparing(Employee::getName).thenComparing(Employee::getSalary,
						Comparator.reverseOrder()))
				.map(e -> new Pair(e.getName(), e.getSalary())).collect(Collectors.toList());

		System.out.println("\nproblem1 output : \n" + result + "\n");

	}
	
	///Transform your pipeline solution to prob2 so that
	//every lambda is replaced by an instance of a
	//local inner class of the correct type
	public static void prob2() {
		
		class YearPredicate implements Predicate<Transaction> {
			public boolean test(Transaction trans) {
				return trans.getYear() == 2011;
			}
		}
		
		
		// use this list
		List<Transaction> list = TraderTransactTestData.getTransactions();
		List<Transaction> result = list.stream().filter(new YearPredicate())
				.sorted(Comparator.comparing(Transaction::getValue)).collect(Collectors.toList());

		System.out.println("problem2 output : \n" + result + "\n");
	}
	
	//Transform your pipeline solution to prob3 so that
	//every lambda is replaced by an instance of a
	//local inner class of the correct type
	public static void prob3() {
		
		class CityPredicate implements Predicate<Transaction> {
			public boolean test(Transaction t) {
				return t.getTrader().getCity().equals("Cambridge");
			}
		}
		
		// Use this list
		List<Transaction> list = TraderTransactTestData.getTransactions();

		List<Trader> result = list.stream().filter(new CityPredicate()).distinct()
				.map(Transaction::getTrader).sorted(Comparator.comparing(Trader::getName)).collect(Collectors.toList());

		System.out.println("problem3 output : \n" + result + "\n");

	}
}
