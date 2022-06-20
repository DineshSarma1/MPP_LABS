package lab3.problem4.code;

abstract public class Property {
	private Address add;
	public Property(Address add) {
		this.add = add;
	}
	abstract double computeRent();
	
	@Override
	public String toString() {
		return add.toString();
	}

}
