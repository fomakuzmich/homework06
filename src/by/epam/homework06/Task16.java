package by.epam.homework06;

public class Task16 {

	public static void main(String[] args) {
		
		int n = 6;
		int[][] massive = new int[n][n];
		
		for (int i = 0; i < massive.length; i++) {
			massive[i][i] = (i + 1) * (i + 2);
		}
		
		for (int i = 0; i < massive.length; i++) {
			
			for (int j = 0; j < massive[i].length; j++) {
				System.out.printf("[%3d] ", massive[i][j]);
			}
			System.out.println();
		}
	}

}
