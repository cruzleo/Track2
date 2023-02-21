package org.ssglobal.training.codes.itemC;

class MyMatrices {
	
	public void addMatrices(int[][]... matrices) {
		for (int[][] matrix : matrices) {
			 int rowLength = matrix.length;
			 int colLength = matrix[0].length;
			
			 if (rowLength == colLength) {
					computeMatrices(matrices);
					break;
				}  else {
					System.out.println("Invalid matrices");
					break;
			}
		}
	}
	
	private void computeMatrices(int[][]... matrices) {
		int sum = 0;
		
		for (int[][] matrix : matrices) {
			for (int[] row : matrix) { 
				for (int col : row) {
						sum = sum + col;
				}
			}
		}
		System.out.println(sum);
	}
}
