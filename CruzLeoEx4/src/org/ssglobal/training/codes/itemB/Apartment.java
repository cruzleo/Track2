package org.ssglobal.training.codes.itemB;

public record Apartment(int size, String address, String... name) {
	
	public void getHeadCount() {
		int count = name.length;
		
		System.out.println("Total no. of occupant: " + count);
	}
	
	public String getLocation() {
		String OccupantName = name[0];
		
		return address + " owned by " + OccupantName;
	}
}
