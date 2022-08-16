package by.epam.homework06;

public class Task34 {

	public static void main(String[] args) {

		int m = 15;
		int n = 10;
		
		int[][] matrix = new int[m][n];
		
		for (int i = 0; i < matrix.length; i++) {
			
			for (int j = 0; j < matrix[i].length; j++) {
				
				if (j >= i) {
					
					matrix[i][j] = 1;
				}
			}
		}
		
		MassiveOperations.printMatrix(matrix);

	}

}
