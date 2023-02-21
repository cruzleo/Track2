package org.ssglobal.training.codes.itemA;

public class TestStatistics {

	public static void main(String[] args) {
		int[] array = {1, 2, 3, 4, 5, 6};
		Statistics s = new Statistics(array);
		s.compute();
		
		int[] array2 = {5, 10, 7, 8, 9, 6};
		Statistics s1 = new Statistics(array2);
		s1.compute();
		
		int[] array3 = {22, 45, 80, 8, 21, 1};
		Statistics s2 = new Statistics(array3);
		s2.compute();
		
		int[] array4 = {4, 34, 89, 12, 23, 6};
		Statistics s3 = new Statistics(array4);
		s3.compute();
		
		int[] array5 = {5, 32, 47, 85, 80, 20};
		Statistics s4 = new Statistics(array5);
		s4.compute();

	}

}
