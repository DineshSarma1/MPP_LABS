package lab3.problem4.code;

public class House extends Property {

	private double lotSize;
	
	public House(double lotSize) {
		super(new Address("1000 north 4th","fairfield","iowa","52557"));
		this.lotSize = lotSize;
	}


	public double computeRent(){
		return 0.1 * lotSize;
	}
}
