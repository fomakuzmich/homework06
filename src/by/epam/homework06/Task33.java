package by.epam.homework06;

public class Task33 {

	public static void main(String[] args) {
		
		int[][] matrix = MassiveOperations.generate2DMassive(5, 5);
		MassiveOperations.printMatrix(matrix);
		System.out.println();
		
		ascendingColumnSort(matrix);
		MassiveOperations.printMatrix(matrix);
		System.out.println();
		
		descendingColumnSort(matrix);
		MassiveOperations.printMatrix(matrix);

	}
	
	public static int[][] ascendingColumnSort(int[][] matrix) {
		
		for (int i = 1; i < matrix.length; i++) {
			
			for (int j = 0; j < matrix[i].length; j++) {
				
				for (int k = 0; k < i; k++) {
					
					if (matrix[i][j] < matrix[k][j]) {
						int x = matrix[i][j];
						
						for (int l = i; l > k; l--) {
							matrix[l][j] = matrix[l - 1][j];
						}
						matrix[k][j] = x;
					}
				}
			}
		}
		return matrix;
	}
	
	public static int[][] descendingColumnSort(int[][] matrix) {
		
for (int i = 1; i < matrix.length; i++) {
			
			for (int j = 0; j < matrix[i].length; j++) {
				
				for (int k = 0; k < i; k++) {
					
					if (matrix[i][j] > matrix[k][j]) {
						int x = matrix[i][j];
						
						for (int l = i; l > k; l--) {
							matrix[l][j] = matrix[l - 1][j];
						}
						matrix[k][j] = x;
					}
				}
			}
		}
		return matrix;
	}

}
