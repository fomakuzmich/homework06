package by.epam.homework06;

public class Task18 {

	public static void main(String[] args) {
		
		int n = 6;
		int[][] massive = new int[n][n];
		
		for (int i = 0; i < massive.length; i++) {
			
			for (int j = 0; j < massive[i].length - i; j++) {
				
				massive[i][j] = i + 1;
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
