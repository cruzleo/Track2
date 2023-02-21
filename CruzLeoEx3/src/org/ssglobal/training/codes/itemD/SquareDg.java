package org.ssglobal.training.codes.itemD;

public class SquareDg {
	public void printDesign(byte height) {
		byte dash = 5;
		
		for (byte i = 1; i <= height; i++) {
			if (i % 2 == 0) {
				continue;
			}
			
			for (byte dashCnt = 1; dashCnt <= dash; dashCnt++) {
				System.out.print("-");
			}
				
			for (byte num = 1; num <= i; num++) {
				System.out.print(i);
			}
				
			for (byte dashCnt = 1; dashCnt <= dash; dashCnt++) {
				System.out.print("-");
			}
			System.out.println();
			dash--;
		}
	}
}

