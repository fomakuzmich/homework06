package by.epam.homework06;

import java.util.Scanner;

public class Task27 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[][] massive = MassiveOperations.generate2DMassive(6, 6);
		MassiveOperations.printMatrix(massive);
		System.out.println();
				
		System.out.println("Input first number of swap column less than six");
		int a = scan.nextInt();
		System.out.println("Input second number of swap column less than six");
		int b = scan.nextInt();
		
		swapColumns(massive, a, b);
		MassiveOperations.printMatrix(massive);
		
		
	
	}
	
	public static int[][] swapColumns(int[][] massive, int a, int b) {
		int x;
		for (int i = 0; i < massive.length; i++) {
			x = massive[i][a];
			massive[i][a] = massive[i][b];
			massive[i][b] = x;
		}
		return massive;
	}

}
