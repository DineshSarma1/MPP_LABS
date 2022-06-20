package assignment4.problem3;

public class Hourly extends Employee{
	
	private double hourlyWage;
	private int hoursPerWeeek;
	
	@Override
	public double calcGrossPay(int month, int yr) {
		
		return hourlyWage * hoursPerWeeek * 4;
	}

}
