package org.ssglobal.training.codes.itemB;

public class Isoceles {
	public boolean isIsoceles(int side1, int side2, int side3) {
		if (side1 == side2 || side1 == side3) {
			return true;
		} else if (side2 == side3 || side1 == side3) {
			return true;
		} else {
			return false;
		}
	}
}
