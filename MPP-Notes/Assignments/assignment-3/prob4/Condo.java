package assignment3.prob4;

public class Condo extends Property{
	
	
	private int noOfFloors;

	public Condo(int noOfFloors) {
		this.noOfFloors = noOfFloors;
	}

	@Override
	public double computeRent() {
		return 400 * noOfFloors;
	}
}
