package assignment3.prob2;

import java.util.ArrayList;
import java.util.List;

public class Building {
	private double maintainanceCost;
	private List<Apartment> apartments;
	
	
	public Building(double maintCost, double apartmentRent) {
		this.maintainanceCost = maintCost;
		apartments = new ArrayList<>();
		apartments.add(new Apartment(apartmentRent));
	}
	
	public List<Apartment> getApartments() {
		return this.apartments;
	}
	
	public double getMaintainanceCost() {
		return this.maintainanceCost;
	}
	
	public void addApartment(Apartment apartment) {
		this.apartments.add(apartment);
	}

}
