package lab3.problem4.code;

public class Condo extends Property {

	private int numberOfFloors;
	
	public Condo(int numberOfFloors) {
		super(new Address("1000 north 4th","fairfield","iowa","52557"));
		this.numberOfFloors = numberOfFloors;
	}

	public double computeRent(){
		return 500 * numberOfFloors;
	}
}
