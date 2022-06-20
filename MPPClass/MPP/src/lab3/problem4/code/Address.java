package lab3.problem4.code;

public class Address {
	private String street;
	private String city;
	private String state;
	private String zipCode;

	public Address(String st, String city, String state, String zip) {
		this.street = st;
		this.city = city;
		this.state = state;
		this.zipCode = zip;
	}
	
	@Override
	public String toString() {
		return "street : " + this.street + "\ncity : "+this.city + "state : " + this.state + "\nZip Code : "+this.zipCode + "\n";
	}

}
