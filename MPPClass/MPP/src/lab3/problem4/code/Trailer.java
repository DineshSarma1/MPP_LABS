package lab3.problem4.code;

public class Trailer extends Property {
	
	public Trailer() {
		super(new Address("1000 north 4th","fairfield","iowa","52557"));
	}

	public double computeRent(){
		return 500;
	}
}
