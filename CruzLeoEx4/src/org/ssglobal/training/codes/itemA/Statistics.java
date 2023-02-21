package org.ssglobal.training.codes.itemA;

public record Statistics(int... data) {
	
	private double mean() {
		int sum = 0;
		
		for (int lookup : data) {
			sum = sum + lookup;
		}
		return sum / data.length;
	}
	
	private double geometricMean() {
		int geoMean = 1;
		
		for (int lookup : data) {
			geoMean = geoMean * lookup;
		}
		return Math.sqrt(geoMean);
	}
	
	private double variance() {
		int variance = 0;
		int mean = 0;
		int sum = 0;
		
		for (int lookup : data) {
			sum = sum + lookup;
		}
		mean = sum / data.length;
		
		for (int lookup : data) {
			variance += Math.pow(lookup - mean, 2);
		}
		return variance / data.length;
	}
	
	void max() {
		 int max = Integer.MIN_VALUE;
		 
		 for (int lookup : data) {
			 if (lookup > max) { 
				 max = lookup;
			 }
		 }
		 System.out.println("Maximum val: " + max);
	
	}
	
	void min() {
		int min = Integer.MAX_VALUE;
		 
		 for (int lookup : data) {
			 if (lookup < min) { 
				 min = lookup;
			 }
		 }
		 System.out.println("Minimum val: " + min);
	}
	
	
	public void compute() {
		System.out.println("Mean: " + mean());
		System.out.println("Geometric Mean: " + geometricMean());
		System.out.println("Variance: " + variance());
		max();
		min();
	}
}
