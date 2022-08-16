package by.epam.homework06;

public class Task17 {

	public static void main(String[] args) {
		
		int n = 8;
		int[][] massive = new int[n][n];
		
		for (int i = 0; i < massive.length; i++) {
			
			for (int j = 0; j < massive[i].length; j++) {
				
				if (i == 0 || j == 0 || i == massive.length - 1 || j == massive[i].length - 1) {
					massive[i][j] = 1;
				}
			}
		}
		
		for (int i = 0; i < massive.length; i++) {
			
			for (int j = 0; j < massive[i].length; j++) {
				
				System.out.printf("%2d", massive[i][j]);
			}
			
			System.out.println();
		}
	}

}
