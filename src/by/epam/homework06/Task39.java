package by.epam.homework06;

public class Task39 {

	public static void main(String[] args) {
		
		int[][] firstMatrix = MassiveOperations.generate2DMassive(4, 6);
		MassiveOperations.printMatrix(firstMatrix);
		System.out.println();
		
		int[][] secondMatrix = MassiveOperations.generate2DMassive(5, 5);
		MassiveOperations.printMatrix(secondMatrix);
		System.out.println();
		
		MassiveOperations.printMatrix(matrixMultiplication(firstMatrix, secondMatrix));
		
	}
	
	public static int[][] matrixMultiplication(int[][] one, int[][] two) {
		
		int[][] matrixMultiplication = new int[Math.max(one.length, two.length)][Math.max(one[0].length, two[0].length)];
		
		for (int i = 0; i < one.length && i < two.length; i++) {
			
			for (int j = 0; j < one[i].length && j < two[i].length; j++) {
				if (i < one.length && i < two.length && j < one[i].length && j < two[i].length) {
					
					matrixMultiplication[i][j] = one[i][j] * two[i][j];
				
				} 
				else {
					
					matrixMultiplication[i][j] = 0;
				}
			}
		}
		return matrixMultiplication;
	}

}
