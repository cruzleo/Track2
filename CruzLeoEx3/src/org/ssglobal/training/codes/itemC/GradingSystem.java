package org.ssglobal.training.codes.itemC;

public class GradingSystem {
	public void evaluation(int testNumber, int score) {
		float weightedScore = 0;
		
		switch (testNumber) {
			case 101, 106:
				weightedScore = score * 0.10F;
				System.out.println("A score of " + score + " on test " + testNumber 
									+ " gives a weighted score of " + weightedScore);
				break;
			case 102, 103:
				weightedScore = score * 0.20F;
				System.out.println("A score of " + score + " on test " + testNumber 
								+ " gives a weighted score of " + weightedScore);
				break;
			case 104, 105:
				weightedScore = score * 0.15F;
				System.out.println("A score of " + score + " on test " + testNumber 
								+ " gives a weighted score of " + weightedScore);
				break;
			default:
				System.out.println("Not a valid test number");
				break;
		}
	}
}
