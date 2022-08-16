package by.epam.homework06;

public class Task23 {

	public static void main(String[] args) {
		
		int n = 10;
		double[][] matrix = new double[n][n];
		
		matrixFromFormula(matrix);
		
		MassiveOperations.printMatrix(matrix);
		
		System.out.printf("Number of positive elements: %4d", numberOfPositiveElements(matrix));
		
	}
	
	public static double[][] matrixFromFormula(double[][] matrix) {
		
		for (int i = 0; i < matrix.length; i++) {
			
			for (int j = 0; j < matrix[i].length; j++) {
				
				matrix[i][j] = Math.sin((Math.pow(i, 2) - Math.pow(j, 2)) / matrix.length);
			}
		}
		return matrix;
	}
	
	public static int numberOfPositiveElements(double[][] matrix) {
		
		int count = 0;
		
		for (int i = 0; i < matrix.length; i++) {
			
			for (int j = 0; j < matrix[i].length; j++) {
				
				if (matrix[i][j] > 0) {
					
					count++;
				}
			}
		}
		return count;
	}

}
