package org.ssglobal.training.codes.itemB;

public class TestIsoceles {

	public static void main(String[] args) {
		Isoceles i = new Isoceles();
		System.out.println(i.isIsoceles(2, 2, 3));
		System.out.println(i.isIsoceles(1, 2, 3));
		System.out.println(i.isIsoceles(3, 2, 3));
		System.out.println(i.isIsoceles(4, 2, 3));
		System.out.println(i.isIsoceles(5, 1, 5));

	}

}
