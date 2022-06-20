package assignment3.prob2;

import java.util.ArrayList;
import java.util.List;

public class LandlordInfo {
	
	private List<Building> buildings;
	
	public LandlordInfo () {
		buildings = new ArrayList<>();
	}
	
	public double calcProfits() {
		double profit = 0.0;
		
		for (Building b : buildings) {
			for(Apartment a: b.getApartments()) {
				profit = profit + a.getRent();
			}
			
			profit = profit - b.getMaintainanceCost();
		}
		
		return profit;
	}
	
	public void addBuilding(Building building) {
		this.buildings.add(building);
	}
	
	
	
}
