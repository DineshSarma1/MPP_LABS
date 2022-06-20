package assignment3.prob4;

abstract class Property extends Address{
	
	
	public Property() {
		super("1000 North 4th street", "Fairfield", "IOWA", "52557");
		
	}

	public abstract double computeRent();

}
