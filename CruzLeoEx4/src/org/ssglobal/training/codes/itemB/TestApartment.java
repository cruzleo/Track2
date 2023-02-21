package org.ssglobal.training.codes.itemB;

public class TestApartment {

	public static void main(String[] args) {
		String[] OccupantNames = {"Leo Cruz", "Minari Myoui", "Hikaru Orol", "Tom Cat"};
 		Apartment ap = new Apartment(127, "Paombong, Bulacan", OccupantNames);
		ap.getHeadCount();
		System.out.println(ap.getLocation());

	}

}
