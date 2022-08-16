package by.epam.homework06;

public class Task15 {

	public static void main(String[] args) {
		
		int n = 20;
		
		int[][] massive = new int[n][n];
		
		for (int i = 0, j = n; i < massive.length; i++) {
			massive[i][i] = j--;
		}
		
		for (int i = 0; i < massive.length; i ++) {
			for (int j = 0; j < massive[i].length; j++) {
				System.out.printf("[%3d] ",massive[i][j]);
			}
			System.out.println();
		}
		
	}

}
