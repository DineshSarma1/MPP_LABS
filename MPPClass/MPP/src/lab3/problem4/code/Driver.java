package lab3.problem4.code;

import java.util.Arrays;

public class Driver {

	public static void main(String[] args) {

		Property[] objects = { new House(9000), new Condo(2), new Trailer() };
		double totalRent = Admin.computeTotalRent(objects);
		System.out.println(totalRent);
		
		for(Property p: objects) {
			System.out.println(p.toString());
		}
	}
}
