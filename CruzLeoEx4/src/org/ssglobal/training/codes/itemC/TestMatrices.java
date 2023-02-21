package org.ssglobal.training.codes.itemC;

public class TestMatrices {

	public static void main(String[] args) {
		MyMatrices mm = new MyMatrices();
		int[][] matrix1 = {{1, 2, 3, 4}, {1, 5, 6, 4}, {7, 8, 9, 4}, {4, 7, 8, 9} };
		int[][] matrix2 = {{1, 2, 3,}, {1, 6, 4}, {8, 9, 4}, {7, 8, 9}};
		int[][] matrix3 = {{3, 4}, {6, 4}, {5, 6}};
		int[][] matrix4 = {{1, 2, 3, 4}, {1, 5, 6, 4}, {7, 8, 9, 4}, {4, 7, 8, 9} };
		mm.addMatrices(matrix1, matrix4);
		mm.addMatrices(matrix3, matrix2);
	}

}
