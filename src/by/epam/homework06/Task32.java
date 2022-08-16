package by.epam.homework06;

public class Task32 {

	public static void main(String[] args) {
		
		int[][] matrix = MassiveOperations.generate2DMassive(5, 5);
		MassiveOperations.printMatrix(matrix);
		System.out.println();
		
		ascendingLineSort(matrix);
		MassiveOperations.printMatrix(matrix);
		System.out.println();
		
		descendingLineSort(matrix);
		MassiveOperations.printMatrix(matrix);

	}
	
	public static int[][] ascendingLineSort(int[][] matrix) {
		
		for (int i = 0; i < matrix.length; i++) {
			
			for (int j = 1; j < matrix[i].length; j++) {
				
				for (int k = 0; k < j; k++) {
					
					if (matrix[i][j] < matrix[i][k]) {
						int x = matrix[i][j];
						
						for (int l = j; l > k; l--) {
							matrix[i][l] = matrix[i][l - 1];
						}
						matrix[i][k] = x;
					}
				}
			}
		}
		return matrix;
	}
	
	public static int[][] descendingLineSort(int[][] matrix) {
		
		for (int i = 0; i < matrix.length; i++) {
			
			for (int j = 1; j < matrix[i].length; j++) {
				
				for (int k = 0; k < j; k++) {
					
					if (matrix[i][j] > matrix[i][k]) {
						int x = matrix[i][j];
						
						for (int l = j; l > k; l--) {
							matrix[i][l] = matrix[i][l - 1];
						}
						matrix[i][k] = x;
					}
				}
			}
		}
		return matrix;
	}

}
