package by.epam.homework06;

import java.util.Random;

public class MassiveOperations {

	public static void main(String[] args) {
		
		
	}
	
	public static void printMatrix(int[][] massive) {
		
		for (int i = 0; i < massive.length; i++) {
			
			for (int j = 0; j < massive[i].length; j++) {
				System.out.printf("%5d", massive[i][j]);
			}
			
			System.out.println();
		}
		
	}
	
	public static void printMatrix(double[][] massive) {
		
		for (int i = 0; i < massive.length; i++) {
			
			for (int j = 0; j < massive[i].length; j++) {
				System.out.printf("%6.2f", massive[i][j]);
			}
			
			System.out.println();
		}
		
	}
	
	public static int[][] generate2DMassive(int x, int y) {
		
		Random random = new Random();
		
		int[][] massive = new int[x][y];
		
		for (int i = 0; i < massive.length; i++) {
			
			for (int j = 0; j < massive[i].length; j++) {
				massive[i][j] = random.nextInt(100);
			}
		}
		
		return massive;
		
	}

}
