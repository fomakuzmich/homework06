package by.epam.homework06;

public class Task31 {

	public static void main(String[] args) {
		
		int[][] matrixFrom0To999 = new int[25][40];
		int x = 0;
		
		for (int i = 0; i < matrixFrom0To999.length; i++) {
			for (int j = 0; j < matrixFrom0To999[i].length; j++) {
				matrixFrom0To999[i][j] = x++;
			}
		}
		
		MassiveOperations.printMatrix(matrixFrom0To999);
		System.out.println();
		System.out.println(twoDigitNumbers(matrixFrom0To999) + " two-digit numbers");
	}
	
	public static int twoDigitNumbers(int[][] massive) {
		
		int count = 0;
		
		for (int i = 0; i < massive.length; i++) {
			
			for (int j = 0; j < massive[i].length; j++) {
				
				if (massive[i][j] > 9 && massive[i][j] < 100) {
					count++;
				}
			}
		}
		return count;
	}

}
