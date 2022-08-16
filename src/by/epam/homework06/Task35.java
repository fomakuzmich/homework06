package by.epam.homework06;

public class Task35 {

	public static void main(String[] args) {
		
		int[][] matrix = MassiveOperations.generate2DMassive(10, 5);
		
		MassiveOperations.printMatrix(matrix);
		
		int max = maxElement(matrix);
		System.out.println("Max element of matrix: " + max);
		
		oddToMaximum(matrix, max);
		
		MassiveOperations.printMatrix(matrix);
		
		
		
		
	}
	
	public static int maxElement(int[][] matrix) {
		
		int max = matrix[0][0];
		
		for (int i = 0; i < matrix.length; i++) {
			
			for (int j = 0; j < matrix[i].length; j++) {
				
				if (matrix[i][j] > max) {
					
					max = matrix[i][j];
				}
			}
		}
		return max;
	}
	
	public static int[][] oddToMaximum(int[][] matrix, int max) {
		
		for (int i = 0; i < matrix.length; i++) {
			
			for (int j = 0; j < matrix[i].length; j++) {
				
				if (matrix[i][j] % 2 != 0) {
					
					matrix[i][j] = max;
				}
			}
		}
		return matrix;
	}

}
