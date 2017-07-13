package Zadania;
import java.util.Random;

/*Napisz program który dla podanego n, narysuje 2-wymiarową tablicę o wymiarach n x n zbudowaną z losowych liczb z przedziału 0-9,
 * a następnie policzy i wyświetli sumę liczb znajdujących się na przekatnej */
public class J6 {

	public static void main(String[] args) {

		int n = 4;
		int suma = 0;
		Random gen = new Random();
		int[][] tab9 = new int[n][n];
		for (int i = 0; i < tab9.length; i++) {
			for (int j = 0; j < tab9[i].length; j++) {
				tab9[i][j] = gen.nextInt(10);
				;
				System.out.print(tab9[i][j] + " ");
			}

			System.out.println();
			suma += tab9[i][i];
		}

		System.out.println("Suma liczb znajdujących się na przekątnej wynosi: " + suma);
	}

}
