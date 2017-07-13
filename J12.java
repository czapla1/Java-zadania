package Zadania;

/*Napisz program wyświetlajacy tabliczke mnożenia w tablicy*/
public class J12 {

	public static void main(String[] args) {
		int[][] tab8 = new int[11][11];

		for (int i = 1; i <= 10; i++) {
			for (int j = 1; j <= 10; j++) {
				tab8[i][j] = i * j;
				System.out.printf("%4d", tab8[i][j]);
			}
			System.out.println();
		}

	}

}
